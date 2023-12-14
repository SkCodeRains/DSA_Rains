package rains.com.recursion;

public class L002ValidPalindrome {
    public static void main(String[] args) {
        // Sample strings
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = ".,";

        // Check if strings are valid palindromes
        // System.out.println(isPalindrome(s1)); // Output: true
        // System.out.println(isPalindrome(s2)); // Output: false
        System.out.println(isPalindrome(s3));
    }

    private static boolean isPalindrome(String s) {
        return help(0, s.length() - 1, s);
    }

    static boolean help(int left, int right, String s) {
        if (!(left < right))
            return true;
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        if (Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--)))
            return false;
        return help(left, right, s);
    }

    // public boolean isPalindrome(String s) {
    // int left = 0, right = s.length() - 1;
    // while (left < right) {

    // while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
    // left++;
    // }
    // while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
    // right--;
    // }
    // if (Character.toLowerCase(s.charAt(left++)) !=
    // Character.toLowerCase(s.charAt(right--)))
    // return false;
    // }
    // return true;
    // }
}
