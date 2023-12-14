package rains.com.number_system_and_bitwise_operation;

public class L001Base7 {
    public static void main(String[] args) {
        int num = 19;
        String ans = convertToBase7(num);
        System.out.println(ans);
    }

    private static String convertToBase7(int num) {
        if (num == 0)
            return "0";
        StringBuilder ans = new StringBuilder();
        boolean neg = num < 0;
        num = Math.abs(num);
        while (num != 0) {
            ans.insert(0, num % 7);
            num = num / 7;
        }
        if (neg)
            ans.insert(0, "-");
        return String.valueOf(ans);
    }
}
