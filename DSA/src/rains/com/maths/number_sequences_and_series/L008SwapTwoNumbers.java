package rains.com.maths.number_sequences_and_series;

import java.util.ArrayList; 
import java.util.List;

public class L008SwapTwoNumbers {
    public static void main(String[] args) {
        List<Integer> res = swapNumbers(10, 18);
        System.out.println(res);
    }

    public static List<Integer> swapNumbers(int a, int b) {
        // Your code goes here
        List<Integer> result = new ArrayList<>(2);
        result.add(0, b);
        result.add(1, a);
        return result;
        // return Arrays.asList(new Integer[] { b, a });
    }
}
