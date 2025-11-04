package mini_project___college_management_system.college.main;

import static java.lang.System.out;
import mini_project___college_management_system.college.department.Department;
import mini_project___college_management_system.college.faculty.Faculty;
import mini_project___college_management_system.college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Faculty f = new Faculty("Dr. Smith", "Computer Science");
        Department d = new Department("CSE", "Dr. Jane Doe");

        out.println("=== College Information ===");
        s.display();
        f.display();
        d.display();
    }
}
