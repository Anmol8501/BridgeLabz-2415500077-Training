package college.student;


public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }
}
