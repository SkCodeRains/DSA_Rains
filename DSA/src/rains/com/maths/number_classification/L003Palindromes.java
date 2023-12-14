package rains.com.maths.number_classification;

public class L003Palindromes {
    public static void main(String[] args) {
        String word = "racecar";

        if (isPalindrome(word)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String word) {

        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
