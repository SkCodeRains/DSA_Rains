package rains.com.arrays;

public class L026NumOfSubarrays {

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 2, 5, 5, 5, 8 }, threshold = 4, windowSize = 3;
        int res = numOfSubarrays(nums, windowSize, threshold);
        System.out.println(res);
    }

    private static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold)
            count++;
        for (int i = k; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            if (sum / k >= threshold)
                count++;
        }
        return count;
    }

}
