package insurance_policy_management_system;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        // Create sample policies
        Policy p1 = new Policy("P100", "Aman", LocalDate.now().plusDays(10), "Health", 4500);
        Policy p2 = new Policy("P200", "Riya", LocalDate.now().plusDays(45), "Auto", 8000);
        Policy p3 = new Policy("P300", "Mehul", LocalDate.now().plusDays(25), "Home", 7000);
        Policy p4 = new Policy("P100", "Duplicate Entry", LocalDate.now().plusDays(20), "Health", 4600);
        Policy p5 = new Policy("P150", "Rohan", LocalDate.now().plusDays(5), "Auto", 6000);

        // Add policies
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);
        manager.addPolicy(p5);

        // Display
        System.out.println("\n===== UNIQUE POLICIES (HashSet) =====");
        manager.getHashSetPolicies().forEach(System.out::println);

        System.out.println("\n===== INSERTION ORDER (LinkedHashSet) =====");
        manager.getLinkedHashSetPolicies().forEach(System.out::println);

        System.out.println("\n===== SORTED BY EXPIRY DATE (TreeSet) =====");
        manager.getTreeSetPolicies().forEach(System.out::println);

        System.out.println("\n===== EXPIRING IN NEXT 30 DAYS =====");
        manager.getExpiringSoon().forEach(System.out::println);

        System.out.println("\n===== COVERAGE TYPE = Auto =====");
        manager.getByCoverage("Auto").forEach(System.out::println);

        System.out.println("\n===== DUPLICATE POLICIES =====");
        manager.findDuplicates(Arrays.asList(p1, p2, p3, p4, p5));

        System.out.println("\n===== PERFORMANCE TEST =====");
        new PerformanceTest().runTest();
    }
}
