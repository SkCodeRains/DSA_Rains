package rains.com.arrays;

public class L019BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int max = maxProfit(nums);
        System.out.println(max);
    }

    private static int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i : nums) {
            if (minPrice > i) {
                minPrice = i;
            }
            if (maxProfit < i - minPrice) {
                maxProfit = i - minPrice;
            }
        }

        return maxProfit;
    }
}
