package rains.com.number_system_and_bitwise_operation;

public class L002ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        int num = 26;
        String res = toHex(num);
        System.out.println(res);

    }

    private static String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder ans = new StringBuilder();
        while (num != 0) {
            int dig = num & 0xF;
            ans.insert(0, (char) (dig < 10 ? '0' + dig : 'a' + dig - 10));
            num >>>= 4;
        }
        return String.valueOf(ans);
    }
}
