package rains.com.arrays;

import java.util.HashMap;
import java.util.Map;

public class L030SubarraySumEqualsK {
    public static void main(String[] args) {
        // Sample array
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 9;

        // Find the number of subarrays with sum equals to k
        int count = subarraySum(nums, k);

        // Print the result
        System.out.println("Original Array: " + java.util.Arrays.toString(nums));
        System.out.println("Number of Subarrays with Sum K: " + count);
    }

    private static int subarraySum(int[] nums, int k) {

        int count = 0, sum = 0;
        Map<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1);
        for (int i : nums) {
            sum += i;
            if (sumFrequency.containsKey(sum - k)) {
                count++;
            }
            sumFrequency.put(sum, sumFrequency.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
