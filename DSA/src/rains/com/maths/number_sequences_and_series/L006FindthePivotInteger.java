package rains.com.maths.number_sequences_and_series;

public class L006FindthePivotInteger {
    public static void main(String[] args) {
        int pivot = getPivot(8);
        System.out.println(pivot);
    }

    private static int getPivot(int n) {
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (totalSum - sum + i == sum) {
                return i;
            }

        }
        return -1;
    }
}
