package com.jdbc.students_project;

public class Student {
    private int id;
    private String enrollmentNumber;
    private String name;
    private int age;
    private String course;
    private String email;
    private String phone;

    public Student() {}

    public Student(int id, String enrollmentNumber, String name, int age, String course, String email, String phone) {
        this.id = id;
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getEnrollmentNumber() { return enrollmentNumber; }
    public void setEnrollmentNumber(String enrollmentNumber) { this.enrollmentNumber = enrollmentNumber; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return String.format("ID: %d | Enrollment: %s | Name: %s | Age: %d | Course: %s | Email: %s | Phone: %s",
                id, enrollmentNumber, name, age, course, email, phone);
    }
}