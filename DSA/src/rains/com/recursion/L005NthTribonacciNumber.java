package rains.com.recursion;

public class L005NthTribonacciNumber {
    public static void main(String[] args) {
        int n = 2; // Change this to the desired value of n
        int result = tribonacci2(n);

        System.out.println("Brute Force: The " + n + "th Tribonacci number is: " + result);
    }

    private static int tribonacci(int n) {
        if (n < 3) {
            return n == 0 ? 0 : n;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    private static int tribonacci2(int n) {
        if (n <= 1) {
            return n;
        }

        int c = 0, b = 0, a = 1;
        while (n-- > 1) {
            int temp = a + b + c;
            c = b;
            b = a;
            a = temp;
        }
        return a;
    }
}
