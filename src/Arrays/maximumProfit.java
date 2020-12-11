package Arrays;

public class maximumProfit {
    public static void main(String[] args) {
        int[] prices = {1, 7, 2, 3, 6, 7, 6, 7};
        System.out.println(maxProfit(prices));
    }

    // 하나씩 따라가면서 증가하면 더한다.
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
