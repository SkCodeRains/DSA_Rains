package rains.com.maths.number_properties_and_operation;

public class L011NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        int ans = findSteps(8);
        System.out.println(ans);
    }

    private static int findSteps(int i) {

        int num = i;
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }
}
