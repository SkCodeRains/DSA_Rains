package rains.com.binary_search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L003FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = { 6, 2 };
        int[] bobSizes = { 9, 5 };
        int[] res = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(res));
    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int res[] = new int[2];
        int sumA = 0, sumB = 0;
        Set<Integer> hash = new HashSet<>();
        for (int i : aliceSizes) {
            sumA += i;
        }
        for (int i : bobSizes) {
            sumB += i;
            hash.add(i);
        }
        int delta = (sumB - sumA) / 2;
        for (int i : aliceSizes) {
            if (hash.contains(i + delta)) {
                res[0] = i;
                res[1] = i + delta;
                return res;
            }
        }
        return res;
    }
}
