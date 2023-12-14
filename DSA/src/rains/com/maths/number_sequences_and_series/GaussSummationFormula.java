package rains.com.maths.number_sequences_and_series;

public class GaussSummationFormula {
    public static void main(String[] args) {
        int n = 100;
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }

    private static int calculateSum(int n) {        
        return n*(n+1)/2;
    }
}
