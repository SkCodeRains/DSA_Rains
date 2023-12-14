package rains.com.binary_search;

public class L006KokoEatingBananas {
    public static void main(String[] args) {
        int piles[] = { 3, 6, 7, 11, 45 };
        int h = 6, hpb = minEatingSpeed(piles, h);
        System.out.println(hpb);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        /*
         * int maxElement = Integer.MIN_VALUE;
         * for (int i : piles) {
         * if (maxElement < i) {
         * maxElement = i;
         * }
         * }
         * 
         * if (piles.length == h) {
         * return maxElement;
         * }
         * 
         * int left = 1;
         * 
         * while (left < maxElement) {
         * // Get the middle index between left and right boundary indexes.
         * // hourSpent stands for the total hour Koko spends.
         * int speed = (left + maxElement) / 2;
         * int hourSpent = 0;
         * 
         * // Iterate over the piles and calculate hourSpent.
         * // We increase the hourSpent by ceil(pile / middle)
         * for (int pile : piles) {
         * hourSpent += Math.ceil((double) pile / speed);
         * }
         * 
         * // Check if middle is a workable speed, and cut the search space by half.
         * if (hourSpent <= h) {
         * maxElement = speed;
         * } else {
         * left = speed + 1;
         * }
         * }
         * 
         * // Once the left and right boundaries coincide, we find the target value,
         * // that is, the minimum workable eating speed.
         * return maxElement;
         */
        int low = 0, high = Integer.MAX_VALUE;
        int ans = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (valid(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    static boolean valid(int[] piles, int h, int speed) {
        for (int ele : piles) {
            double hour = (int) Math.ceil((double) (ele) / (double) (speed));
            h -= hour;
        }
        return h >= 0;
    }
}