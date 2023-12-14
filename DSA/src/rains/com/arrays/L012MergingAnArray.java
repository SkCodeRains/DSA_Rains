package rains.com.arrays;

import java.util.Arrays;

public class L012MergingAnArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2 };
        int[] arr2 = { 2, 4, 6, 8, 9 };

        int[] merged = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int pointer1 = 0, pointer2 = 0;
        for (int i = 0; i < merged.length; i++) {

            if (pointer1 < arr1.length && (pointer2 >= arr2.length || arr1[pointer1] <= arr2[pointer2])) {
                merged[i] = arr1[pointer1++];
            } else {
                merged[i] = arr2[pointer2++];
            }

            // if (pointer1 < arr1.length && pointer2 < arr2.length) {
            // if (arr1[pointer1] > arr2[pointer2]) {
            // merged[i] = arr2[pointer2++];
            // } else if (arr1[pointer1] < arr2[pointer2]) {
            // merged[i] = arr1[pointer1++];
            // }
            // } else if (pointer1 < arr1.length) {
            // merged[i] = arr1[pointer1++];
            // } else if (pointer2 < arr2.length) {
            // merged[i] = arr2[pointer2++];
            // }

        }

        return merged;
    }

}
