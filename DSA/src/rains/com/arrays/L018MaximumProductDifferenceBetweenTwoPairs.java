package rains.com.arrays;

public class L018MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        int dif = maxProductDifference(nums);
        System.out.println(dif);
    }

    private static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = max1, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }

            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }
        }
        return (max1 * max2) - (min1 * min2);
    }
}
