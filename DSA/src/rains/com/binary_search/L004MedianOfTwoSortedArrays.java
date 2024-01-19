package rains.com.binary_search;

public class L004MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 6 }, nums2 = { 3, 4, 5 };
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int right = nums1.length + nums2.length;
        int mid = 0;
        int indA = 0, indB = 0;
        int i = 0;
        mid = (right / 2);
        int[] res = new int[mid + 1];
        while (mid >= i) {

            int num1 = (indA < nums1.length) ? nums1[indA] : Integer.MAX_VALUE;
            int num2 = (indB < nums2.length) ? nums2[indB] : Integer.MAX_VALUE;

            if (num1 < num2) {
                res[i++] = num1;
                indA++;
            } else {
                res[i++] = num2;
                indB++;
            }

        }
        if (mid < i && right % 2 == 0) {
            return ((double) res[mid - 1] + res[mid]) / (2);
        }
        return res[mid];
    }

}
