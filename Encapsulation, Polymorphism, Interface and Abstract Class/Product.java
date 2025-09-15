abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.15;
    }

    public String getTaxDetails() {
        return "Electronics tax at 15%";
    }
}

class Clothing extends Product implements Taxable {
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.2;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "Clothing tax at 5%";
    }
}

class Groceries extends Product {
    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

class ProductPriceCalculator {
    static void printFinalPrice(Product p) {
        double tax = 0;
        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }
        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;
        System.out.println("Final price of " + p.getName() + ": " + finalPrice);
    }
}
