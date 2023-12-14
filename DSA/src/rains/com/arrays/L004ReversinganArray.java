package rains.com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class L004ReversinganArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reversinganArray(arr);
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = { 1, 2, 3, 4, 5 };
        reverse(arr2);
    }

    static void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    private static void reversinganArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            nums[start] = nums[start] ^ nums[end];
            nums[end] = nums[start] ^ nums[end];
            nums[start] = nums[start] ^ nums[end];
            start++;
            end--;
        }
    }
}