package rains.com.arrays;

public class L009SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = { -10, 1, 5, 6, -145 };
        int sm = smallesElementInTheArray(arr);
        System.out.println(sm);
    }

    private static int smallesElementInTheArray(int[] nums) {

        int sm = Integer.MAX_VALUE;

        for (int i : nums) {
            sm = Math.min(i, sm);
        }

        return sm;
    }
}
