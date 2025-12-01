package price_calculator;

import java.util.*;

class Product {
    private double price;
    public Product(double price) { this.price = price; }
    public double getPrice() { return price; }
}

class Mobile extends Product { public Mobile(double p) { super(p); } }
class Laptop extends Product { public Laptop(double p) { super(p); } }

class Main {
    public static double calculateTotal(List<? extends Product> items) {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = List.of(new Mobile(15000), new Mobile(20000));
        List<Laptop> laptops = List.of(new Laptop(50000), new Laptop(70000));
        System.out.println("Mobile Total: " + calculateTotal(mobiles));
        System.out.println("Laptop Total: " + calculateTotal(laptops));
    }
}
