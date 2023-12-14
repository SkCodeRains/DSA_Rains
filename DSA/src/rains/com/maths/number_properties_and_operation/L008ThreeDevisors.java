package rains.com.maths.number_properties_and_operation;

public class L008ThreeDevisors {    

    public static void main(String[] args) {
        boolean ans = isThree(40);
        System.out.println(ans);
    }

    public static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }

        return count == 3;
    }
}
