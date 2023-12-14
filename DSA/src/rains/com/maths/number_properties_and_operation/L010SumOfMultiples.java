package rains.com.maths.number_properties_and_operation;

public class L010SumOfMultiples {
    public static void main(String[] args) {
        int ans = sumMultitples(7);
        System.out.println(ans);
    }

    private static int sumMultitples(int i) {
        int res = 0;
        for (int j = 0; j <= i; j++) {
            if (j % 3 == 0 || j % 5 == 0 || j % 7 == 0) {
                res += j;
            }
        }

        return res;
    }
}
