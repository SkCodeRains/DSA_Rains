package rains.com.arrays;

public class L027LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBACCCCCDFFFFDDDFDDDFVC";
        int k = 1, res = characterReplacement(s, k);
        System.out.println(res);
    }

    private static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int largestCount = 0, bag = 0, maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
            largestCount = Math.max(largestCount, arr[s.charAt(i) - 'A']);
            if (i - bag + 1 - largestCount > k) {
                arr[s.charAt(bag) - 'A']--;
                bag++;  
            }
            maxlen = Math.max(maxlen, i - bag + 1);
        }
        return maxlen;
    }
}
