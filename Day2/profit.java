public class profit {
    public static void main(String[] args) {
        int costPrice = 129; // Example cost price
        int sellingPrice = 191; // Example selling price
        int profit = sellingPrice - costPrice; // Calculate profit
        int profitPercentage = (profit * 100) / costPrice; // Calculate profit percentage

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%.");
    }
}
