package rains.com.maths.number_sequences_and_series;

public class L009Factorial {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return factorial(number - 1) * number;
    }
}
