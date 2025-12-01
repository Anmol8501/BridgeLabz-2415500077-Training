package com.jdbc.students_project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements IStudent {
    private final Connection conn;

    public StudentImpl(IConnection connection) {
        this.conn = connection.getConnection();
    }

    @Override
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT PRIMARY KEY, " +
                "enrollment_number VARCHAR(50) UNIQUE NOT NULL, " +
                "name VARCHAR(100) NOT NULL, " +
                "age INT, " +
                "course VARCHAR(100), " +
                "email VARCHAR(100), " +
                "phone VARCHAR(15)" +
                ")";
        try (Statement st = conn.createStatement()) {
            st.executeUpdate(sql);
            System.out.println(" Table 'students' created successfully!");
        } catch (SQLException e) {
            System.out.println("️ Table might already exist or error occurred: " + e.getMessage());
        }
    }

    @Override
    public void insertStudent(Student s) {
        String sql = "INSERT INTO students (id, enrollment_number, name, age, course, email, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getEnrollmentNumber());
            ps.setString(3, s.getName());
            ps.setInt(4, s.getAge());
            ps.setString(5, s.getCourse());
            ps.setString(6, s.getEmail());
            ps.setString(7, s.getPhone());
            ps.executeUpdate();
            System.out.println(" Student inserted successfully!");
        } catch (SQLException e) {
            System.out.println(" Error inserting student: " + e.getMessage());
        }
    }

    @Override
    public void insertMultipleStudents(List<Student> students) {
        String sql = "INSERT INTO students (id, enrollment_number, name, age, course, email, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            conn.setAutoCommit(false);
            for (Student s : students) {
                ps.setInt(1, s.getId());
                ps.setString(2, s.getEnrollmentNumber());
                ps.setString(3, s.getName());
                ps.setInt(4, s.getAge());
                ps.setString(5, s.getCourse());
                ps.setString(6, s.getEmail());
                ps.setString(7, s.getPhone());
                ps.addBatch();
            }
            ps.executeBatch();
            conn.commit();
            System.out.println(students.size() + " students inserted successfully!");
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Error inserting students: " + e.getMessage());
        }
    }

    @Override
    public void updateStudent(Student s) {
        String sql = "UPDATE students SET enrollment_number=?, name=?, age=?, course=?, email=?, phone=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getEnrollmentNumber());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());
            ps.setString(5, s.getEmail());
            ps.setString(6, s.getPhone());
            ps.setInt(7, s.getId());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("️ No student found with that ID!");
            }
        } catch (SQLException e) {
            System.out.println(" Error updating student: " + e.getMessage());
        }
    }

    @Override
    public void updateSpecificField(int id, String field, String value) {
        String sql = "UPDATE students SET " + field + "=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            // Handle different data types
            if (field.equals("age") || field.equals("id")) {
                ps.setInt(1, Integer.parseInt(value));
            } else {
                ps.setString(1, value);
            }
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println(field + " updated successfully!");
            } else {
                System.out.println("️ No student found with that ID!");
            }
        } catch (SQLException e) {
            System.out.println(" Error updating field: " + e.getMessage());
        }
    }

    @Override
    public void updateMultipleStudents(List<Student> students) {
        for (Student s : students) {
            updateStudent(s);
        }
    }

    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println(" Student deleted successfully!");
            } else {
                System.out.println("️ No student found with that ID!");
            }
        } catch (SQLException e) {
            System.out.println(" Error deleting student: " + e.getMessage());
        }
    }

    @Override
    public void deleteMultipleStudents(List<Integer> ids) {
        String sql = "DELETE FROM students WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            conn.setAutoCommit(false);
            for (int id : ids) {
                ps.setInt(1, id);
                ps.addBatch();
            }
            ps.executeBatch();
            conn.commit();
            System.out.println(ids.size() + " students deleted successfully!");
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Error deleting students: " + e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students ORDER BY id";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setEnrollmentNumber(rs.getString("enrollment_number"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setCourse(rs.getString("course"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
        return list;
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setEnrollmentNumber(rs.getString("enrollment_number"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setCourse(rs.getString("course"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                return s;
            }
        } catch (SQLException e) {
            System.out.println("Error fetching student: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Student> searchStudentsByName(String name) {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE name LIKE ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setEnrollmentNumber(rs.getString("enrollment_number"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setCourse(rs.getString("course"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error searching students: " + e.getMessage());
        }
        return list;
    }

    @Override
    public List<Student> searchStudentsByCourse(String course) {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE course LIKE ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + course + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setEnrollmentNumber(rs.getString("enrollment_number"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setCourse(rs.getString("course"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error searching students: " + e.getMessage());
        }
        return list;
    }
}