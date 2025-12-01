package inventory_management_for_a_store;
import java.util.*;

public class StoreInventory {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Soap", 40);
        inventory.put("Shampoo", 25);
        inventory.put("Toothpaste", 15);
        inventory.put("Biscuits", 30);

        System.out.println("Initial Inventory: " + inventory);

        buyProduct(inventory, "Soap", 10);
        buyProduct(inventory, "Toothpaste", 15); 
        buyProduct(inventory, "Shampoo", 5);

        addShipment(inventory, "Biscuits", 20);
        addShipment(inventory, "Soap", 15);

        System.out.println("\nAfter Purchases & Shipment: " + inventory);

        queryProduct(inventory, "Soap");
        queryProduct(inventory, "Toothpaste");
        queryProduct(inventory, "Cereal"); // not stocked

        System.out.println("\nOut of stock products:");
        inventory.entrySet().stream()
                .filter(e -> e.getValue() == 0)
                .forEach(e -> System.out.println(e.getKey()));
    }

    public static void buyProduct(Map<String, Integer> inventory, String product, int qty) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " not found in inventory.");
            return;
        }

        int updatedQty = inventory.get(product) - qty;

        if (updatedQty <= 0) {
            System.out.println(product + " is now out of stock.");
            inventory.put(product, 0);
        } else {
            inventory.put(product, updatedQty);
        }
    }

    public static void addShipment(Map<String, Integer> inventory, String product, int qty) {
        inventory.put(product, inventory.getOrDefault(product, 0) + qty);
        System.out.println("Shipment added: " + product + " +" + qty);
    }

    public static void queryProduct(Map<String, Integer> inventory, String product) {
        Integer qty = inventory.get(product);
        if (qty == null) {
            System.out.println(product + " → Not stocked");
        } else {
            System.out.println(product + " → " + qty + " units left");
        }
    }
}
