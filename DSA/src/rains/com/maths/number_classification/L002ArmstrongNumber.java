package rains.com.maths.number_classification;

public class L002ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println(number + " is Armstrong number: " + isArmstrong);
    }

    private static boolean isArmstrongNumber(int number) {

        int sum = 0;
        int len = String.valueOf(number).length();
        int num = number;

        while (number > 0) {
            int dig = number % 10;
            sum += Math.pow(dig, len);
            number /= 10;
        }

        return sum == num;
    }

}
