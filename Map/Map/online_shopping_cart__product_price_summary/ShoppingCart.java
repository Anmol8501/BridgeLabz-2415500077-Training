package online_shopping_cart__product_price_summary;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 700.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Headphones", 2500.0);

        System.out.println("Cart Items (Order Added):");
        cart.forEach((p, price) -> System.out.println(p + " → " + price));

        double total = cart.values().stream().mapToDouble(x -> x).sum();
        System.out.println("Total = " + total);

        if (total > 5000) {
            double discounted = total * 0.9;
            System.out.println("After 10% Discount = " + discounted);
        }

        cart.remove("Mouse");
        System.out.println("\nUpdated Cart:");
        cart.forEach((p, price) -> System.out.println(p + " → " + price));
    }
}
