
public class Employee {
    
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Salary: $" + this.salary);
    }

    // --- Main method to test THIS class ---
    public static void main(String[] args) {
        // Created an Employee object
        Employee emp1 = new Employee("Jane Doe", 101, 75000.00);

        // Display the details
        System.out.println("--- Employee Details ---");
        emp1.displayDetails();
    }
}