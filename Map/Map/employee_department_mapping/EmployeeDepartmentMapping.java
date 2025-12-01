package employee_department_mapping;
import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {

        Map<Integer, String> empDept = new HashMap<>();

        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");
        empDept.put(106, "Marketing");

        empDept.put(103, "IT");

        System.out.println("Employees in IT:");
        for (int id : empDept.keySet()) {
            if (empDept.get(id).equals("IT"))
                System.out.println(id);
        }

        Map<String, Integer> countMap = new HashMap<>();

        for (String dept : empDept.values()) {
            countMap.put(dept, countMap.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nEmployees per department:");
        countMap.forEach((d, c) -> System.out.println(d + " → " + c));
    }
}
