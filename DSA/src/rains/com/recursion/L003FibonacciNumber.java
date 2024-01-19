package rains.com.recursion;

public class L003FibonacciNumber {

    public static void main(String[] args) {
        int n = 10; // Change this to the desired value of n
        int result = fibonacci2(n);
        System.out.println("Brute Force: The " + n + "th Fibonacci number is: " + result);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int fibonacci2(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1, b = 0;
        while (n-- > 1) {
            a = a + b;
            b = a - b;
        }
        return a;
    }
}
