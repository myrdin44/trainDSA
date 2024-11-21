package week8;

public class timeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int totalProfit = 0;

        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
            }
            if (price > buyPrice) {
                totalProfit += price - buyPrice;
                buyPrice = price;
            }
        }

        return totalProfit;
    }    
}
