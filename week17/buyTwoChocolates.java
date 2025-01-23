package week17;

import java.util.Arrays;

public class buyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int minPrice = prices[0] + prices[1];

        if (minPrice > money) {
            return money;
        }

        return money - minPrice;
    }
}
