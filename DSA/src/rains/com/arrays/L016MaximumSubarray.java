package rains.com.arrays;

public class L016MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = { -3, 2, 1, -4, 7, 6, 3, -2, 1, 3, -15 };
        int max = maxSubArray(nums);
        System.out.println(max);
    }

    public static int maxSubArray(int[] nums) {

        int bag = 0;
        int sum = 0;

        for (int i : nums) {
            sum += i;
            bag = Math.max(bag, sum);
            sum = Math.max(0, sum);
        }

        return bag;
    }
}
