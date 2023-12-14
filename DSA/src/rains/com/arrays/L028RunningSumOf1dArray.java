package rains.com.arrays;

public class L028RunningSumOf1dArray {
    public static void main(String[] args) {
        // Sample array
        int[] nums = { 1, 2, 3, 4, 5 };

        // Calculate the running sum
        System.out.println("Original Array: " + java.util.Arrays.toString(nums));
        int[] runningSum = calculateRunningSum(nums);
        // Print the result
        System.out.println("Running Sum: " + java.util.Arrays.toString(runningSum));
    }

    private static int[] calculateRunningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
