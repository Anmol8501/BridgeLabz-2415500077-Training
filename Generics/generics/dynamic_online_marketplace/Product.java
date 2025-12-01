package dynamic_online_marketplace;

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    public Product(String name, double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String toString() { return name + " - " + price; }
}