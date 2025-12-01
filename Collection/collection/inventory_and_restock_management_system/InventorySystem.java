package inventory_and_restock_management_system;
import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {

        // -----------------------------------------------------
        // 1️⃣ DATA STRUCTURES
        // -----------------------------------------------------

        // Set to store unique product names
        Set<String> productNames = new HashSet<>();

        // List to store product details [name, price, stock]
        List<String[]> products = new ArrayList<>();

        // Queue for products that need restocking
        Queue<String[]> restockQueue = new LinkedList<>();

        // Stack for rollback of recent restocks
        Stack<String[]> restockedStack = new Stack<>();


        // -----------------------------------------------------
        // 2️⃣ ADD PRODUCTS (avoid duplicates)
        // -----------------------------------------------------
        System.out.println("Adding Products...");

        addProduct("Milk", 50, 5, productNames, products);
        addProduct("Rice", 40, 2, productNames, products);
        addProduct("Eggs", 6, 30, productNames, products);
        addProduct("Milk", 55, 10, productNames, products); // duplicate ignored

        displayProducts(products);



        // -----------------------------------------------------
        // 3️⃣ IDENTIFY LOW STOCK ITEMS (<10) AND ENQUEUE THEM
        // -----------------------------------------------------
        System.out.println("\nChecking for low-stock items...");

        for (String[] p : products) {
            int stock = Integer.parseInt(p[2]);
            if (stock < 10) {
                restockQueue.add(p);
                System.out.println("Low stock → Added to restock queue: " + p[0]);
            }
        }



        // -----------------------------------------------------
        // 4️⃣ PROCESS RESTOCK QUEUE
        // -----------------------------------------------------
        System.out.println("\nProcessing Restock Queue...\n");

        while (!restockQueue.isEmpty()) {
            String[] prod = restockQueue.poll();
            System.out.println("Restocking: " + prod[0]);

            int oldStock = Integer.parseInt(prod[2]);
            prod[2] = String.valueOf(oldStock + 20); // Add 20 units

            restockedStack.push(prod); // store for rollback
            System.out.println("New Stock of " + prod[0] + ": " + prod[2] + "\n");
        }



        // -----------------------------------------------------
        // 5️⃣ ROLLBACK LAST RESTOCK OPERATION
        // -----------------------------------------------------
        System.out.println("Attempting Rollback...");

        if (!restockedStack.isEmpty()) {
            String[] lastRestocked = restockedStack.pop();

            int currentStock = Integer.parseInt(lastRestocked[2]);
            lastRestocked[2] = String.valueOf(currentStock - 20); // undo restock

            System.out.println("Rollback done for: " + lastRestocked[0]);
            System.out.println("Reverted Stock: " + lastRestocked[2]);
        }


        // -----------------------------------------------------
        // 6️⃣ FINAL PRODUCT LIST
        // -----------------------------------------------------
        System.out.println("\nFinal Product List:");
        displayProducts(products);
    }

    // Helper to add product
    private static void addProduct(String name, int price, int stock,
                                   Set<String> names, List<String[]> list) {

        if (names.contains(name)) {
            System.out.println("Duplicate product ignored: " + name);
            return;
        }

        names.add(name);
        list.add(new String[]{ name, String.valueOf(price), String.valueOf(stock) });
        System.out.println("Product added: " + name);
    }

    // Helper to display products
    private static void displayProducts(List<String[]> products) {
        System.out.println("\nProducts:");
        for (String[] p : products) {
            System.out.println(p[0] + " | Price: " + p[1] + " | Stock: " + p[2]);
        }
    }
}
