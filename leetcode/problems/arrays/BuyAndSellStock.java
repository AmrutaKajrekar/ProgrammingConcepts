package problems.arrays;

/**
 * @author amruta.kajrekar on 7/23/18.
 * problem:
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

 */
public class BuyAndSellStock {
  public static void main(String[] args){
    BuyAndSellStock stock = new BuyAndSellStock();
    stock.maxProfit(new int[]{7,6,4,3,1});
  }

  public int maxProfit(int[] prices) {
    if(prices.length==0 || prices.length==1) return 0;
    int maxProfit = 0;
    if(prices.length==2){
      maxProfit = Math.max(maxProfit, (prices[1]-prices[0]));
    }

    int buyPrice = prices[0];

    for(int i=1;i<prices.length;i++){
      if(prices[i] > buyPrice)
        maxProfit = Math.max(maxProfit, (prices[i] - buyPrice));
      else
        buyPrice = prices[i];
    }
    return maxProfit;
  }

}
