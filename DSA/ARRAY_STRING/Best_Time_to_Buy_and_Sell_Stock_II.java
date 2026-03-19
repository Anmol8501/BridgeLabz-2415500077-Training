public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_II obj = new Best_Time_to_Buy_and_Sell_Stock_II();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
    
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]>prices[i])
            {
                profit+= prices[i+1]-prices[i];
            }
        }

        return profit;
    }
}
