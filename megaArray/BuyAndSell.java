public class BuyAndSell {
    public static void main(String[] args) {
        int stock[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n= stock.length;
        // System.out.println(calculateMaximumProfit(stock, 0, n-1));

        // efficient solution: here we are buying stock when it has minimum price 
        // and sellibg stock when it has more price by adding previous higher value
        // like there is 3,8,10 so (10-3)=7 and also (8-3)+(10-2)=7 so both ae same thing
        System.out.println(maxProfit(stock, n));
    }

    // efficient bali method
    static int maxProfit(int prices[], int size)
    {
       
        // maxProfit adds up the difference between
        // adjacent elements if they are in increaisng order
        int maxProfit = 0;
       
        // The loop starts from 1
        // as its comparing with the previous
        for (int i = 1; i < size; i++)
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        return maxProfit;
    }
   

    public static int calculateMaximumProfit(int price[], int start, int end) {
         // If the stocks can't be bought
    if (end <= start)
    return 0;

// Initialise the profit
int profit = 0;

// The day at which the stock
// must be bought
for (int i = start; i < end; i++)
{

    // The day at which the
    // stock must be sold
    for (int j = i + 1; j <= end; j++)
    {

        // If buying the stock at ith day and
        // selling it at jth day is profitable
        if (price[j] > price[i])
        {

            // Update the current profit
            int curr_profit = (price[j] - price[i])
                            + calculateMaximumProfit(price, start, i - 1)
                            + calculateMaximumProfit(price, j + 1, end);

            // Update the maximum profit so far
            profit = Math.max(profit, curr_profit);
        }
    }
}
return profit;
    }
}