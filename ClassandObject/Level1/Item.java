public class Item {
    
    private String itemCode;
    private String itemName;
    private double price;


    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Item Code: " + this.itemCode);
        System.out.println("Item Name: " + this.itemName);
        System.out.printf("Price: $%.2f\n", this.price);
    }

    public double calculateTotalCost(int quantity) {
        return this.price * quantity;
    }

    
    public static void main(String[] args) {
        
        Item apple = new Item("A100", "Apple", 0.99);


        System.out.println("--- Item Details ---");
        apple.displayDetails();
        System.out.println(); 

      
        int quantityToBuy = 12;
        double totalCost = apple.calculateTotalCost(quantityToBuy);
        
        System.out.printf("Total cost for %d units: $%.2f\n", quantityToBuy, totalCost);
    }
}