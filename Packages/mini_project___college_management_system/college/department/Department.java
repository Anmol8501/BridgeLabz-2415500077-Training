package mini_project___college_management_system.college.department;

public class Department {
    public String name;
    public String hod;

    public Department(String name, String hod) {
        this.name = name;
        this.hod = hod;
    }

    public void display() {
        System.out.println("Department: " + name + " | HOD: " + hod);
    }
}
