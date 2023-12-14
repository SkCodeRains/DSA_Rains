package rains.com.arrays;

import java.util.Arrays;

public class L006MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] moveZeros(int[] nums) {
        // Your code goes here

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j++] = nums[i];
                nums[i] = temp; 
            }
        }

        return nums;
    }
}
