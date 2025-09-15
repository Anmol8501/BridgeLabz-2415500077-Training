class Product {
    static double discount = 0.1;
    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount);
            System.out.println("Product ID: " + p.productID);
        }
    }
}
