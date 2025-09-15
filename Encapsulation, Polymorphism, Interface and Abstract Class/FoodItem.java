abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - discount);
    }

    public void applyDiscount(double percentage) {
        discount = percentage;
    }

    public String getDiscountDetails() {
        return "Veg item discount: " + discount * 100 + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 20;

    NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity() + extraCharge) * (1 - discount);
    }

    public void applyDiscount(double percentage) {
        discount = percentage;
    }

    public String getDiscountDetails() {
        return "Non-Veg item discount: " + discount * 100 + "%";
    }
}
