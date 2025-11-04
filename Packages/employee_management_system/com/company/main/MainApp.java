package employee_management_system.com.company.main;

import employee_management_system.com.company.hr.Employee;
import employee_management_system.com.company.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", "Finance", 50000);
        Payroll payroll = new Payroll();

        payroll.calculateBonus(emp);

        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Salary after bonus: " + emp.getSalary());
    }
}
