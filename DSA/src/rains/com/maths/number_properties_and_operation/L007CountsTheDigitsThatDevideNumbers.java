package rains.com.maths.number_properties_and_operation;

public class L007CountsTheDigitsThatDevideNumbers {
    public static int countDigits(int num) {

        int x = num;
        int count = 0;
        while (x > 0) {
            int dig = x % 10;
            if (num % dig == 0) {
                count++;
            }
            x /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int ans = countDigits(1248);
        System.out.println(ans);
    }
}
