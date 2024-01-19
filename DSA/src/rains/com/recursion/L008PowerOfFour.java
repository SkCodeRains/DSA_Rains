package rains.com.recursion;

public class L008PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));

    }

    static boolean isPowerOfFour(int n) {
        return n == 1 ? true : ((n <= 0) || (n % 4 != 0)) ? false : isPowerOfFour(n / 4);
        // return (num > 0) && (Math.log(num) / Math.log(2) % 2 == 0);
    }
}
