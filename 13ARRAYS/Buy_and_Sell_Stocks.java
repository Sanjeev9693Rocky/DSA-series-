//lec-13.14  Buy & Sell stocks
import java.util.*;

public class Buy_and_Sell_Stocks {
    public static int BuyandSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {     //profit
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyandSellStocks(prices));
    }
}


//time complexity is O(n)