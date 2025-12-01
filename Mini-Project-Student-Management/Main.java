package com.jdbc.students_project;

public class Main {
	public static void main(String[] args) {
        IConnection conn = new ConnectionImpl();
        IStudent studentService = new StudentImpl(conn);
        IMenu menu = new MenuImpl(studentService);

        System.out.println("Welcome to JDBC Student Database System");
        System.out.println("managed By Chinmay Sharma");
        menu.showMenu();
    }

}
