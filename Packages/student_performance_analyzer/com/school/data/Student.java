package student_performance_analyzer.com.school.data;

public class Student {
    private String name;
    private int marks1, marks2, marks3;

    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public int getMarks1() { return marks1; }
    public int getMarks2() { return marks2; }
    public int getMarks3() { return marks3; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student: " + name + " [Marks: " + marks1 + ", " + marks2 + ", " + marks3 + "]";
    }
}
