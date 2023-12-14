package rains.com.arrays;

public class L021MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int major = majorityElement(nums);
        System.out.println(major);
    }

    private static int majorityElement(int[] nums) {

        int elem = 0;

        int count = 0;

        for (int i : nums) {
            if (count == 0) {
                elem = i;
                count = 1;
            } else if (elem == i) {
                count++;
            } else {
                count--;
            }
        }
        return elem;
    }
}
