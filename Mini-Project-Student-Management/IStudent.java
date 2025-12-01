package com.jdbc.students_project;

import java.util.List;

public interface IStudent {
    void createTable();
    void insertStudent(Student s);
    void insertMultipleStudents(List<Student> students);
    void updateStudent(Student s);
    void updateSpecificField(int id, String field, String value);
    void updateMultipleStudents(List<Student> students);
    void deleteStudent(int id);
    void deleteMultipleStudents(List<Integer> ids);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    List<Student> searchStudentsByName(String name);
    List<Student> searchStudentsByCourse(String course);
}