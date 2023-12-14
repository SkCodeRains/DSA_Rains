package rains.com.maths.number_classification;

public class L001PrimeNumber {

    public static void main(String[] args) {
        boolean ans = isPrime(14);
        System.out.println(ans);
    }

    private static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

}
