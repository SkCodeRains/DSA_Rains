package rains.com.maths.number_sequences_and_series;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int firstTerms = 2;
        int commonDifference = 3;
        int n = 5;

        System.out.println("Arithematic progression");
        for (int i = 1; i <= n; i++) {
            int term = nthTerm(firstTerms, commonDifference, i);
            System.out.print(term + " ");
        }

        // Sum of terms
        System.out.println();
        int sum = sumOfTerms(firstTerms, commonDifference, n);
        System.out.println("Sum of terms: " + sum);
        int lastTerm = nthTerm(firstTerms, commonDifference, n);
        int numberOfTerms = numberOfTerms(firstTerms, lastTerm, commonDifference);
        System.out.println("Number of terms : " + numberOfTerms);
    }

    private static int numberOfTerms(int firstTerms, int lastTerm, int commonDifference) {
        /* n = ((last term - first term) / d) + 1. */
        return ((lastTerm - firstTerms) / commonDifference) + 1;
    }

    private static int sumOfTerms(int firstTerms, int commonDifference, int n) {
        // formula (n/2) * (2a + (n - 1) * d). for getting the sume of the terms
        return (n / 2) * (2 * firstTerms + (n - 1) * commonDifference);
    }

    private static int nthTerm(int firstTerms, int commonDifference, int i) {
        // a + (n - 1) * d formula will be used to produce nth
        return firstTerms + (i - 1) * commonDifference;

    }
}
