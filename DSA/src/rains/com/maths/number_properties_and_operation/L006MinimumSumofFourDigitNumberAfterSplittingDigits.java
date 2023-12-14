package rains.com.maths.number_properties_and_operation;

import java.util.Arrays;

public class L006MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        int ans = minimumSumofFourDigitNumberAfterSplittingDigits(1239);
        System.out.println(ans);
    }

    static int minimumSumofFourDigitNumberAfterSplittingDigits(int num) {
        byte[] pair = new byte[4];
        byte index = 0;
        while (num > 0) {
            /*
             * byte dig = (byte) (num % 10);
             * num /= 10;
             * byte x = (byte) (num % 10);
             * pair[index++] = dig;
             * pair[index++] = x;
             */

            pair[index++] = (byte) (num % 10);
            num /= 10;
        }

        Arrays.sort(pair);

        int x = (pair[0] * 10 + pair[2]);
        int y = (pair[1] * 10 + pair[3]);

        return x + y;
    }
}
