package rains.com.arrays;

public class L020FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int max = largestAltitude(gain);
        System.out.println(max);
    }

    private static int largestAltitude(int[] gain) {
        int maxVal = 0, maxAlt = maxVal;
        for (int i : gain) {
            maxVal += i;
            if (maxVal > maxAlt) {
                maxAlt = maxVal;
            }
        }
        return maxAlt;
    }
}
