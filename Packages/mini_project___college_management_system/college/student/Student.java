package mini_project___college_management_system.college.student;

public class Student {
    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
    }
}
