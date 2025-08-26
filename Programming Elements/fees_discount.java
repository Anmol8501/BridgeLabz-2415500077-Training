import java.util.*;
public class fees_discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total fee: ");
        int totalFee = scanner.nextInt(); // Input total fee
        System.out.print("Enter the discount percentage: ");
        double discount = scanner.nextDouble();
        double discountRate = discount / 100; // Convert percentage to decimal
        double discountAmount = totalFee * discountRate; // Calculate discount amount
        double finalFee = totalFee - discountAmount; // Calculate final fee after discount

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee + ".");
    }
    
}
