package rains.com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L014TwoSum {
    public static void main(String[] args) {
        int[] nums = { -2, 2, 6, 5, 8, 11 };
        int[] ans = twoSum(nums, 0);
        System.out.println(Arrays.toString(ans));

    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j };
        // }
        // }

        // }
        // return new int[0];
    }
}
