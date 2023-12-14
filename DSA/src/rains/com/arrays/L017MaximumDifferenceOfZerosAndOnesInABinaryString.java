package rains.com.arrays;

public class L017MaximumDifferenceOfZerosAndOnesInABinaryString {
    public static void main(String[] args) {
        String str = "11000010001";
        int dif = getMaxDifference(str);
        System.out.println(dif);

    }

    private static int getMaxDifference(String s) {

        int bag = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i) == '0' ? 1 : -1;
            bag = Math.max(bag, sum);
            sum = Math.max(0, sum);
        }

        return bag == 0 ? -1 : bag;
    }
}
