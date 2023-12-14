package rains.com.binary_search;

public class L001FindPeakElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    private static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
