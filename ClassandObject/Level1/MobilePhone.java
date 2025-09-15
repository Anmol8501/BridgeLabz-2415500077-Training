
public class MobilePhone {
  
    private String brand;
    private String model;
    private double price;

    
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

   
    public void displayDetails() {
        System.out.println("Phone Brand: " + this.brand);
        System.out.println("Phone Model: " + this.model);
        System.out.println("Phone Price: $" + this.price);
    }

    
    public static void main(String[] args) {
       
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 899.99);

        
        System.out.println("--- Phone 1 Details ---");
        phone1.displayDetails();
        
        System.out.println("\n--- Phone 2 Details ---");
        phone2.displayDetails();
    }
}