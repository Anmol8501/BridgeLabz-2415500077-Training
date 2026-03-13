package Singly_Linked_List_Student_Record_Management;

public class Main {

    public static void main(String[] args) {

        System.out.println("----- Student List -----");
        StudentList students = new StudentList();
        students.addFirst(1, "Aman", 20, "A");
        students.addLast(2, "Riya", 21, "B");
        students.addLast(3, "Karan", 22, "A");
        students.addAtPosition(4, "Rahul", 23, "B", 2);
        students.delete(2);
        students.update(1, "Aman", 20, "A");
        students.display();
    }
}