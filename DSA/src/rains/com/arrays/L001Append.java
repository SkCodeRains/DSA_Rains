package rains.com.arrays;

import java.util.Arrays;

public class L001Append {
    public static void main(String[] args) {
        // Existing array
        int[] arr = { 1, 2, 3, 4, 5 };

        // New element to append
        int newElement = 6;

        int[] newArray = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArray, 0, arr.length);

        newArray[arr.length] = newElement;

        System.out.println(Arrays.toString(newArray));

    }
}
