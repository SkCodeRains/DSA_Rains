package rains.com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L031HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = countSmallerNumbers(nums);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] countSmallerNumbers(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max = Math.max(i, max);
        }
        int freq[] = new int[max + 1];
        int result[] = new int[nums.length];
        for (int i : nums) {
            freq[i]++;
        }
        for (int i = 1; i < freq.length - 1; i++) {
            freq[i] += freq[i - 1];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i] == 0 ? 0 : freq[nums[i] - 1];
        }

        return result;
    }

    private static int[] countSmallerNumbersBrute(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
