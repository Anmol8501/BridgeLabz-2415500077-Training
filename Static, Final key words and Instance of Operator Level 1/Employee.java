class Employee {
    static String companyName = "Tech Corp";
    private static int employeeCount = 0;
    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        employeeCount++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
            System.out.println("Designation: " + e.designation);
        }
    }
}
