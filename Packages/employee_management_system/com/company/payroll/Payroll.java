package employee_management_system.com.company.payroll;

import employee_management_system.com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
    }
}
