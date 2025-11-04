package creating_and_using_userdefined_packages.college.student;

public class Student {
    String studentName;
    int rollNo;
    public void displayStudentName(String name) {
        this.studentName = name;
        System.out.println("Student Name: " + studentName);
    }
    public void displayStudentRollNo(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Student Roll No: " + rollNo);
    }
}
