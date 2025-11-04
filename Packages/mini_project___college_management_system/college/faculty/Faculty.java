package mini_project___college_management_system.college.faculty;

public class Faculty {
    public String name;
    public String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Faculty: " + name + ", Subject: " + subject);
    }
}
