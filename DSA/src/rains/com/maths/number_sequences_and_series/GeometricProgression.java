package rains.com.maths.number_sequences_and_series;

public class GeometricProgression {
    public static void main(String[] args) {
        double firstTerm = 2;
        double commonRatio = 3;
        int n = 5;

        System.out.println("Geometric Progression: ");
        for (int i = 1; i <= n; i++) {
            double term = nthTerm(firstTerm, commonRatio, i);
            System.out.print(term + " ");
        }

        double sum = sumOfTerms(firstTerm, commonRatio, n);

        System.out.println("\nSum of terms: " + sum);

    }

    private static double sumOfTerms(double firstTerm, double commonRatio, int n) {

        // a∗(1−r(n) )/(1−r)
        return firstTerm * (1 - Math.pow(commonRatio, n)) / (1 - commonRatio);
    }

    private static double nthTerm(double firstTerm, double commonRatio, int i) {
        /*
         * a∗r ( * n−1)
         */

        return Math.pow(commonRatio, i - 1) * firstTerm;
    }
}
