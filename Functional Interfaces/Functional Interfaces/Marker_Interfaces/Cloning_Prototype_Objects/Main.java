package Marker_Interfaces.Cloning_Prototype_Objects;

public class Main {
    public static void main(String[] args) {
        try {
            ProductImpl p1 = new ProductImpl(101, "Laptop");
            ProductImpl p2 = (ProductImpl) p1.clone(); 
            System.out.println("Original: " + p1.productName);
            System.out.println("Clone: " + p2.productName);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}
