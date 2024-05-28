public class problem8 {
    // Best time to Buy and Sell Stocks
    public static int maxProfit(int [] prices)
    {
        int buyprice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0;i<prices.length;i++)
        {
            if(buyprice > prices[i])
            {
                buyprice = prices[i];
            }else{
                profit = Math.max(profit, prices[i] - buyprice);
            }
        }
        return profit;
    }
    public static void main(String args [])
    {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit is : "+maxProfit(prices));
    }
}
