package rains.com.recursion;

public class L009PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }

    private static boolean isPowerOfThree(int n) {
        return n == 1 ? true : (n <= 0 || n % 3 != 0) ? false : isPowerOfThree(n / 3);
        // return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        // if (n == 0)
        // return false;
        // while (n % 3 == 0) {
        // n /= 3;
        // }
        // return n == 1;
    }
}
