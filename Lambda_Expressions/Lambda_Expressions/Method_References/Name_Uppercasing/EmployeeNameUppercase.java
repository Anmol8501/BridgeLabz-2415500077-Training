package Method_References.Name_Uppercasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Amit", "Priya", "Rohit", "Sneha");

        System.out.println("=== Employee Names in Uppercase ===");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
