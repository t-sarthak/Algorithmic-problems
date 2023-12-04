package org.algos.codes.day0;

public class BuyAndSellStock1 {

    public static int maxStockProfit(int[] prices) {
        int buyPrice = prices[0];
        int currentProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            currentProfit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxStockProfit(prices);
        System.out.println(result);
    }
}
