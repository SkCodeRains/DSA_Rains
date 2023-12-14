package rains.com.maths.number_properties_and_operation;

import java.util.Arrays;

public class L009FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        int ans = findGCD(new int[] {7,5,6,8,3 });
        System.out.println(ans);
    }

    private static int findGCD(int[] nums) {
        Arrays.sort(nums);
        return GCD(nums[0], nums[nums.length - 1]);
    }

    private static int GCD(int i, int j) {
        return j == 0 ? i : GCD(j, i % j);
    }
}
