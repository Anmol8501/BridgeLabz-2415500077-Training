package employee_salary_directory;
import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {

        Map<String, Double> employees = new HashMap<>();

        employees.put("Amit", 55000.0);
        employees.put("Neha", 72000.0);
        employees.put("Rohan", 68000.0);
        employees.put("Priya", 45000.0);
        employees.put("Sara", 72000.0);
        employees.put("Kabir", 60000.0);

        giveRaise(employees, "Amit", 10);
        giveRaise(employees, "Neha", 5);
        giveRaise(employees, "XYZ", 20); 

        double avg = employees.values().stream().mapToDouble(x -> x).average().orElse(0);
        System.out.println("Average Salary = " + avg);

        double max = Collections.max(employees.values());
        System.out.println("Highest Salary = " + max);
        System.out.println("Employees with highest salary:");
        for (String emp : employees.keySet()) {
            if (employees.get(emp) == max)
                System.out.println(emp);
        }
    }

    static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (!map.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        double newSalary = map.get(name) * (1 + percent / 100);
        map.put(name, newSalary);
    }
}
