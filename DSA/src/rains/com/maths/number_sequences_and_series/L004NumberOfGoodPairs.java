package rains.com.maths.number_sequences_and_series;

public class L004NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int pairs = numIdenticalPairs(nums);
        System.out.println(pairs);
    }

    private static int numIdenticalPairs(int[] nums) {
        int ans = 0, cnt[] = new int[101];
        for (int a : nums) { 
            ans += cnt[a]++;
        }
        return ans;

        /*
         * int[] frequency = new int[102];
         * for (int i : nums) {
         * frequency[i]++;
         * }
         * int totalpairs = 0;
         * for (int i : frequency) {
         * totalpairs += ((i) * (i - 1)) / 2;
         * }
         * return totalpairs;
         */
    }
}
