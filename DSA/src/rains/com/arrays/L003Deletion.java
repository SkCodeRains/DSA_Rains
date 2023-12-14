package rains.com.arrays;

import java.util.Arrays;

public class L003Deletion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int index = 2;

        deletinganElementbyIndex(arr, index);
        int[] arr2 = { 1, 2, 3, 4, 5 };
        deletinganElementbyValue(arr2, 4);

    }

    private static void deletinganElementbyValue(int[] arr2, int val) {
        int index = getTheIndex(arr2, val);
        if (index > -1)
            deletinganElementbyIndex(arr2, index);
    }

    private static int getTheIndex(int[] arr2, int val) {
        for (int i = 0; i < arr2.length; i++) {
            if (val == arr2[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void deletinganElementbyIndex(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int newArr[] = Arrays.copyOf(arr, arr.length - 1);
        // new int[arr.length - 1];
        // System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        System.out.println(Arrays.toString(newArr));
    }
}
