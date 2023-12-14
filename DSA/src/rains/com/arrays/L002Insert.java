package rains.com.arrays;

import java.util.Arrays;

public class L002Insert {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // New element to append
        int newElement = 10;
        int at = 2;
        insertAtbegningOrMiddle(arr, newElement, at);
        System.out.println(Arrays.toString(arr));
        arr = new int[] { 1, 2, 3, 4, 5 };
        arrayInsertionattheEnd(arr, newElement);
        System.out.println(Arrays.toString(arr));
        arr = new int[] { 1, 2, 3, 4, 5 };

    }

    private static void arrayInsertionattheEnd(int[] arr, int newElement) {
        arr[arr.length - 1] = newElement;

    }

    private static void insertAtbegningOrMiddle(int[] arr, int newElement, int at) {
        for (int i = arr.length - 1; i > at; i--) {
            arr[i] = arr[i - 1];
        }
        arr[at] = newElement;
    }
}
