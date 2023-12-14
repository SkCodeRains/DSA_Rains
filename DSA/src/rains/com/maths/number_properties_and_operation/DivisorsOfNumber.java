package rains.com.maths.number_properties_and_operation;

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int number = 12;
        List<Integer> divisors = getDivisors(number);

        System.out.println("Divisors of " + number + ":");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }

    private static List<Integer> getDivisors(int number) {

        List<Integer> devisors = new ArrayList<Integer>();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                devisors.add(i);
                if (number / i != i) {
                    devisors.add((number / i));
                }
            }
        }

        return devisors;
    }
}
