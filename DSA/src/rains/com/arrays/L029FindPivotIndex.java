package rains.com.arrays;

public class L029FindPivotIndex {
    public static void main(String[] args) {
        // Sample array
        int[] nums = { 1, 7, 3, 6, 5, 6 };

        // Find the pivot index
        int pivotIndex = findPivotIndex(nums);

        // Print the result
        System.out.println("Original Array: " + java.util.Arrays.toString(nums));
        System.out.println("Pivot Index: " + pivotIndex);
    }

    private static int findPivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = sum - leftSum - nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
