package rains.com.binary_search;

public class L005FindTheDuplicateNumber {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 6, 7, 8, 5, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 9, 2 },
                res = findDuplicate(nums);
        System.out.println(res);

    }

    private static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (slow == fast)
                break;
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}
