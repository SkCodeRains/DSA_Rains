package rains.com.arrays;

public class L011SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { -10, 1, 5, 6, -145 };
        int ssm = secondLargestElementInTheArray(arr);
        System.out.println(ssm);
    }

    private static int secondLargestElementInTheArray(int[] nums) {

        int largest = nums[0], secondLargest = Integer.MIN_VALUE;

        for (int i : nums) {
            if (largest < i) {
                secondLargest = largest;
                largest = i;
            } else if (secondLargest < i && i != largest) {
                secondLargest = i;
            }
        }

        return secondLargest;
    }
}
