package rains.com.arrays;

public class L007LargestElementInTheArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int big = largestElementInTheArray(arr);
        System.out.println(big);
    }

    private static int largestElementInTheArray(int[] nums) {

        int max = nums[0];
        for (int i : nums) {
            max = Math.max(i, max);
        }

        return max;
    }
}
