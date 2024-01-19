package rains.com.recursion;

public class L004ClimbingStairs {
    public static void main(String[] args) {
        int n = 8; // Change this to the desired number of stairs
        int result = climbStairs(n);
        System.out.println("Brute Force: Number of ways to climb " + n + " stairs: " + result);

    }

    private static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    private static int climbStairs2(int n) {
        if (n <= 3) {
            return n;
        }

        int a = 1, b = 0;
        while (n-- > 0) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
