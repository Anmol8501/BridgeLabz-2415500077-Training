package e_commerce_order_processing_system;
import java.util.*;

public class EcommerceSystem {
    public static void main(String[] args) {

        // -------------------------
        // 1. List to store all orders
        // -------------------------
        List<Map<String, Object>> allOrders = new ArrayList<>();

        // Creating sample orders (Order = Map)
        Map<String, Object> o1 = Map.of("id", 101, "item", "Laptop");
        Map<String, Object> o2 = Map.of("id", 102, "item", "Phone");
        Map<String, Object> o3 = Map.of("id", 101, "item", "Laptop");  // duplicate
        Map<String, Object> o4 = Map.of("id", 103, "item", "Mouse");

        allOrders.add(o1);
        allOrders.add(o2);
        allOrders.add(o3);  // duplicate
        allOrders.add(o4);

        System.out.println("All Orders (with duplicates):");
        allOrders.forEach(System.out::println);

        // -------------------------
        // 2. Remove duplicate orders using Set
        // -------------------------

        Set<Integer> uniqueOrderIDs = new HashSet<>();
        Queue<Map<String, Object>> processingQueue = new LinkedList<>();

        for (Map<String, Object> order : allOrders) {
            int id = (int) order.get("id");

            if (!uniqueOrderIDs.contains(id)) {
                uniqueOrderIDs.add(id);
                processingQueue.add(order);  // add only unique orders
            }
        }

        System.out.println("\nUnique Orders added to Processing Queue:");
        processingQueue.forEach(System.out::println);

        // -------------------------
        // 3. Process orders in FIFO
        // -------------------------

        Stack<Map<String, Object>> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders:");
        while (!processingQueue.isEmpty()) {

            Map<String, Object> order = processingQueue.remove();
            System.out.println("Processing Order: " + order);

            // Simulating failure for order ID=102
            if ((int) order.get("id") == 102) {
                System.out.println("❌ Order Failed: " + order);
                failedOrders.push(order);
            } else {
                System.out.println("✅ Order Completed: " + order);
            }
        }

        // -------------------------
        // 4. Retry Failed Orders from Stack (LIFO)
        // -------------------------
        System.out.println("\nRe-processing Failed Orders:");

        while (!failedOrders.isEmpty()) {
            Map<String, Object> order = failedOrders.pop();
            System.out.println("Retrying Order: " + order);

            // Simulating success on retry
            System.out.println("✅ Order Successfully Re-Processed: " + order);
        }
    }
}
