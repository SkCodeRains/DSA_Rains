package rains.com.maths.number_sequences_and_series;

public class L005MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int pairs = findMissingNumber(nums);
        System.out.println(pairs);
    }

    private static int findMissingNumber(int[] nums) {
        int missingNumber = nums.length * (nums.length + 1) / 2;
        for (int i : nums)
            missingNumber -= i;
        return missingNumber;
    }

}
