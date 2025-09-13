public class Student {
    // Instance variables
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // 1. Private helper method to calculate grade
    private char calculateGrade() {
        if (this.marks >= 90) {
            return 'A';
        } else if (this.marks >= 80) {
            return 'B';
        } else if (this.marks >= 70) {
            return 'C';
        } else if (this.marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // 2. Public method to display details AND grade
    public void displayDetailsAndGrade() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Marks: " + this.marks);
        // Call the private helper method
        System.out.println("Grade: " + calculateGrade());
    }

    // --- Main method to test THIS class ---
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 10, 92.5);
        Student student2 = new Student("Bob", 11, 74.0);

        System.out.println("--- Student Report 1 ---");
        student1.displayDetailsAndGrade();

        System.out.println("\n--- Student Report 2 ---");
        student2.displayDetailsAndGrade();
    }
}