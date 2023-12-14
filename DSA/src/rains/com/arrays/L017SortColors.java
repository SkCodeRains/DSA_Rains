package rains.com.arrays;

import java.util.Arrays;

public class L017SortColors {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }

    }

    private static void swap(int[] nums, int i, int j) {
        if (nums[i] == nums[j])
            return;
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
