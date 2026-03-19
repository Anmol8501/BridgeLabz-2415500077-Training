public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock obj = new Best_Time_to_Buy_and_Sell_Stock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int max_profit = 0, bestBuy = prices[0];
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] > bestBuy)
            {
                max_profit = Math.max(max_profit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }

        return max_profit;
    }
}