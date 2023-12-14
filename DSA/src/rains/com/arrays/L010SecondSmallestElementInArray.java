package rains.com.arrays;

public class L010SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = { -10, 1, 5, 6, -145 };
        int ssm = secondeSmallesElementInTheArray(arr);
        System.out.println(ssm);
    }

    private static int secondeSmallesElementInTheArray(int[] nums) {

        int sm = 0, secondSm = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i < sm) {
                secondSm = sm;
                sm = i;
            } else if (secondSm > i && i != sm) {
                secondSm = i;
            }
        }

        return secondSm;
    }
}
