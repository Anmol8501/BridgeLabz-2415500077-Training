package com.jdbc.students_project;

import java.util.*;

public class MenuImpl implements IMenu {
    private final Scanner sc = new Scanner(System.in);
    private final IStudent studentService;

    public MenuImpl(IStudent studentService) {
        this.studentService = studentService;
    }

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║   STUDENT DATABASE MANAGEMENT SYSTEM   ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1.   Create Table");
            System.out.println("2.   Insert a Student");
            System.out.println("3.   Insert Multiple Students");
            System.out.println("4.  ️  Update Student");
            System.out.println("5.  ️  Update Specific Field");
            System.out.println("6.  ️  Update Multiple Students");
            System.out.println("7.   Delete a Student");
            System.out.println("8.   Delete Multiple Students");
            System.out.println("9.  ️  Show All Students");
            System.out.println("10.  Search Student by ID");
            System.out.println("11.  Search Students by Name");
            System.out.println("12.  Search Students by Course");
            System.out.println("13.  Exit");
            System.out.print("Choose an option: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    createTable();
                    break;
                case 2:
                    insertOne();
                    break;
                case 3:
                    insertMultiple();
                    break;
                case 4:
                    updateOne();
                    break;
                case 5:
                    updateSpecificField();
                    break;
                case 6:
                    updateMultiple();
                    break;
                case 7:
                    deleteOne();
                    break;
                case 8:
                    deleteMultiple();
                    break;
                case 9:
                    showAll();
                    break;
                case 10:
                    searchById();
                    break;
                case 11:
                    searchByName();
                    break;
                case 12:
                    searchByCourse();
                    break;
                case 13:
                    System.out.println(" Thank you for using Student Management System. Goodbye!");
                    return;
                default:
                    System.out.println(" Invalid option! Please try again.");
                    break;
            }
        }
    }

    private void createTable() {
        System.out.println("\n Creating students table...");
        studentService.createTable();
    }

    private void insertOne() {
        System.out.println("\n INSERT NEW STUDENT");
        System.out.println("─────────────────────");
        Student s = getStudentInput();
        studentService.insertStudent(s);
    }

    private void insertMultiple() {
        System.out.println("\n INSERT MULTIPLE STUDENTS");
        System.out.println("──────────────────────────");
        System.out.print("Enter number of students: ");
        int n = getIntInput();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\n Student " + (i + 1) + ":");
            list.add(getStudentInput());
        }
        studentService.insertMultipleStudents(list);
    }

    private void updateOne() {
        System.out.println("\n️  UPDATE STUDENT");
        System.out.println("────────────────");
        System.out.print("Enter student ID to update: ");
        int id = getIntInput();
        
        Student existing = studentService.getStudentById(id);
        if (existing == null) {
            System.out.println("⚠ No student found with ID: " + id);
            return;
        }
        
        System.out.println("\nCurrent details:");
        System.out.println(existing);
        System.out.println("\nEnter new details:");
        
        Student s = getStudentInput();
        s.setId(id); // Keep the same ID
        studentService.updateStudent(s);
    }

    private void updateSpecificField() {
        System.out.println("\n UPDATE SPECIFIC FIELD");
        System.out.println("────────────────────────");
        System.out.print("Enter student ID: ");
        int id = getIntInput();
        
        Student existing = studentService.getStudentById(id);
        if (existing == null) {
            System.out.println("️ No student found with ID: " + id);
            return;
        }
        
        System.out.println("\nCurrent details:");
        System.out.println(existing);
        
        System.out.println("\nWhat would you like to update?");
        System.out.println("1. Enrollment Number");
        System.out.println("2. Name");
        System.out.println("3. Age");
        System.out.println("4. Course");
        System.out.println("5. Email");
        System.out.println("6. Phone");
        System.out.print("Choose field: ");
        
        int fieldChoice = getIntInput();
        String field = "";
        
        switch (fieldChoice) {
            case 1: field = "enrollment_number"; break;
            case 2: field = "name"; break;
            case 3: field = "age"; break;
            case 4: field = "course"; break;
            case 5: field = "email"; break;
            case 6: field = "phone"; break;
            default:
                System.out.println(" Invalid field choice!");
                return;
        }
        
        System.out.print("Enter new value: ");
        String value = sc.nextLine();
        
        studentService.updateSpecificField(id, field, value);
    }

    private void updateMultiple() {
        System.out.println("\n️  UPDATE MULTIPLE STUDENTS");
        System.out.println("───────────────────────────");
        System.out.print("Enter number of students to update: ");
        int n = getIntInput();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\n Student " + (i + 1) + ":");
            System.out.print("Enter ID to update: ");
            int id = getIntInput();
            Student s = getStudentInput();
            s.setId(id);
            list.add(s);
        }
        studentService.updateMultipleStudents(list);
    }

    private void deleteOne() {
        System.out.println("\n DELETE STUDENT");
        System.out.println("────────────────");
        System.out.print("Enter student ID to delete: ");
        int id = getIntInput();
        
        Student existing = studentService.getStudentById(id);
        if (existing != null) {
            System.out.println("\nStudent to delete:");
            System.out.println(existing);
            System.out.print("Are you sure? (yes/no): ");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                studentService.deleteStudent(id);
            } else {
                System.out.println("️ Deletion cancelled.");
            }
        } else {
            System.out.println(" No student found with that ID!");
        }
    }

    private void deleteMultiple() {
        System.out.println("\n DELETE MULTIPLE STUDENTS");
        System.out.println("──────────────────────────");
        System.out.print("Enter number of students to delete: ");
        int n = getIntInput();
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID " + (i + 1) + ": ");
            ids.add(getIntInput());
        }
        
        System.out.print("Are you sure you want to delete " + n + " students? (yes/no): ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            studentService.deleteMultipleStudents(ids);
        } else {
            System.out.println("️ Deletion cancelled.");
        }
    }

    private void showAll() {
        System.out.println("\n ALL STUDENTS");
        System.out.println("═══════════════════════════════════════════════════════════════");
        List<Student> list = studentService.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("️ No students found in database!");
        } else {
            System.out.println("Total Students: " + list.size());
            System.out.println("───────────────────────────────────────────────────────────────");
            list.forEach(System.out::println);
        }
    }

    private void searchById() {
        System.out.println("\n SEARCH BY ID");
        System.out.println("──────────────");
        System.out.print("Enter student ID: ");
        int id = getIntInput();
        Student s = studentService.getStudentById(id);
        if (s != null) {
            System.out.println("\n Student found:");
            System.out.println(s);
        } else {
            System.out.println("️ No student found with ID: " + id);
        }
    }

    private void searchByName() {
        System.out.println("\n SEARCH BY NAME");
        System.out.println("────────────────");
        System.out.print("Enter name (partial match allowed): ");
        String name = sc.nextLine();
        List<Student> list = studentService.searchStudentsByName(name);
        if (list.isEmpty()) {
            System.out.println("️ No students found with name: " + name);
        } else {
            System.out.println("\n Found " + list.size() + " student(s):");
            System.out.println("───────────────────────────────────────────────────────────────");
            list.forEach(System.out::println);
        }
    }

    private void searchByCourse() {
        System.out.println("\n SEARCH BY COURSE");
        System.out.println("──────────────────");
        System.out.print("Enter course name (partial match allowed): ");
        String course = sc.nextLine();
        List<Student> list = studentService.searchStudentsByCourse(course);
        if (list.isEmpty()) {
            System.out.println(" No students found in course: " + course);
        } else {
            System.out.println("\n Found " + list.size() + " student(s):");
            System.out.println("───────────────────────────────────────────────────────────────");
            list.forEach(System.out::println);
        }
    }

    private Student getStudentInput() {
        System.out.print("ID: ");
        int id = getIntInput();
        
        System.out.print("Enrollment Number: ");
        String enrollmentNumber = sc.nextLine();
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Age: ");
        int age = getIntInput();
        
        System.out.print("Course: ");
        String course = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.nextLine();
        
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        
        return new Student(id, enrollmentNumber, name, age, course, email, phone);
    }

    private int getIntInput() {
        while (true) {
            try {
                int value = sc.nextInt();
                sc.nextLine(); // Clear buffer
                return value;
            } catch (InputMismatchException e) {
                System.out.print(" Invalid input! Please enter a number: ");
                sc.nextLine(); // Clear invalid input
            }
        }
    }
}