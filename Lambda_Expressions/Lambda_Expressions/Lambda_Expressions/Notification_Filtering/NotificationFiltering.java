package Lambda_Expressions.Notification_Filtering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", 5),
            new Alert("Medication Reminder", 2),
            new Alert("Appointment", 1),
            new Alert("Critical Lab Result", 4)
        );

        Predicate<Alert> highPriorityFilter = a -> a.priority >= 4;
        Predicate<Alert> emergencyOnly = a -> a.type.equalsIgnoreCase("Emergency");

        System.out.println("=== High Priority Alerts ===");
        alerts.stream().filter(highPriorityFilter).forEach(System.out::println);

        System.out.println("\n=== Emergency Only Alerts ===");
        alerts.stream().filter(emergencyOnly).forEach(System.out::println);
    }
}
