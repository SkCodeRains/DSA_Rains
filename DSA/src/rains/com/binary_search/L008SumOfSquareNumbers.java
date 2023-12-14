package rains.com.binary_search;

public class L008SumOfSquareNumbers {
    public static void main(String[] args) {
        int c = 5;
        boolean res = judgeSquareSum(c);
        System.out.println(res);
    }

    private static boolean judgeSquareSum(int c) {
        int left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c)
                return true;
            else if (sum > c)
                right--;
            else
                left++;
        }
        return false;
    }
}
