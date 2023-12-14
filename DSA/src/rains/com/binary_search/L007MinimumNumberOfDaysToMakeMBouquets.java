package rains.com.binary_search;

public class L007MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int bloomDay[] = { 1, 10, 3, 10, 2 }, m = 3, k = 1, min_Days = minDays(bloomDay, m, k);
        System.out.println(min_Days);

    }

    private static int minDays(int[] bloomDay, int m, int k) {
        return 0;
    }
}

class Solution {
    public double myPow(double x, int n) {
        if (n <= 0) {
            return 1;
        }
        return x * myPow(x, n - 1);
    }
}