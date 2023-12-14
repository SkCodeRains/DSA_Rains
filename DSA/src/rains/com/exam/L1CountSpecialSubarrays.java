package rains.com.exam;

public class L1CountSpecialSubarrays {

    public static int countSpecialSubarrays(int[] nums) {
        int n = nums.length;
        int result = 0;

        // Iterate through all subarrays
        for (int start = 0; start < n; start++) {
            int onesCount = 0;
            int zerosCount = 0;

            for (int end = start; end < n; end++) {
                if (nums[end] == 1) {
                    onesCount++;
                } else {
                    zerosCount++;
                }

                // Check if the subarray has more 1's than 0's
                if (onesCount > zerosCount) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1 };
        int result = countSpecialSubarrays(nums);
        System.out.println(result);
    }

}

