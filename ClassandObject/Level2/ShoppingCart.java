

// We need to import List and ArrayList to hold the items
import java.util.ArrayList;
import java.util.List;

/**
 * Main public class. The file must be named ShoppingCart.java
 * This class has the main method and manages the list of items.
 */
public class ShoppingCart {
    // A cart HAS A list of CartItems
    private List<CartItem> items;

    // Constructor initializes an empty list
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Method to add an item
    public void addItem(CartItem item) {
        this.items.add(item);
        System.out.println(item.getItemName() + " was added to the cart.");
    }

    // Method to remove an item (by name)
    public void removeItem(String itemName) {
        // We use removeIf to find and remove the item that matches the name
        boolean removed = this.items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        
        if (removed) {
            System.out.println(itemName + " was removed from the cart.");
        } else {
            System.out.println(itemName + " not found in cart.");
        }
    }

    // Method to display the total cost of ALL items
    public void displayTotalCost() {
        double totalCost = 0.0;
        // Loop through every item in the list
        for (CartItem item : this.items) {
            // Add that item's subtotal (price * qty) to the grand total
            totalCost += item.getItemTotalCost();
        }

        System.out.println("--------------------");
        System.out.printf("Shopping Cart Total Cost: $%.2f\n", totalCost);
    }

    // --- Main method to test THIS class ---
    public static void main(String[] args) {
        // 1. Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // 2. Create some items (using the CartItem class below)
        CartItem item1 = new CartItem("Apple", 0.99, 10); // 10 Apples
        CartItem item2 = new CartItem("Bread", 3.50, 2);  // 2 Loaves of bread

        // 3. Add items to cart
        cart.addItem(item1);
        cart.addItem(item2);

        // 4. Display total
        cart.displayTotalCost(); // Should be (0.99*10) + (3.50*2) = 9.90 + 7.00 = 16.90

        System.out.println(); // Add space

        // 5. Remove an item
        cart.removeItem("Apple");

        // 6. Display total again
        cart.displayTotalCost(); // Should just be 7.00
    }
}


/**
 * Helper Class. This class is NOT public.
 * It just holds data for an item and exists within the same ShoppingCart.java file.
 */
class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters needed by the ShoppingCart class
    public String getItemName() {
        return this.itemName;
    }
    
    // Helper method to get the total cost for THIS item line (price * quantity)
    public double getItemTotalCost() {
        return this.price * this.quantity;
    }
}