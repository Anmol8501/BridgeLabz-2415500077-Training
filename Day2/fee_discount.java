public class fee_discount {
    public static void main(String[] args) {
        int totalFee = 125000; // Example total fee
        double discountRate = 0.10; // 10% discount
        double discountAmount = totalFee * discountRate; // Calculate discount amount
        double finalFee = totalFee - discountAmount; // Calculate final fee after discount

        System.out.println("The discount amount is INR"+ discountAmount+" and final discounted fee is INR" + finalFee + ".");
    }
    
}
