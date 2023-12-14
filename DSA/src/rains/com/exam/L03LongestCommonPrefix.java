package rains.com.exam;

public class L03LongestCommonPrefix {
    public static void main(String[] args) {
        // Example usage:
        String[] strings = { "flower", "flow", "flight" };
        String commonPrefix = longestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + commonPrefix); // Output: "fl"
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        int minLen = strs[0].length(); 
        main: for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                try {
                    if (strs[j].charAt(i) != ch) {
                        break main;
                    }
                } catch (Exception e) {
                    break main;
                }
            }
            commonPrefix.append(ch);
        }
        return commonPrefix.toString();
    }

    // private static String longestCommonPrefix(String[] strs) {
    // StringBuilder commonPrefix = new StringBuilder();
    // int minLen = strs[0].length();
    // main: for (int i = 0; i < minLen; i++) {
    // char ch = strs[0].charAt(i);
    // for (int j = 1; j < strs.length; j++) {
    // if (strs[j].charAt(i) != ch) {
    // break main;
    // }
    // }
    // commonPrefix.append(ch);
    // }
    // return commonPrefix.toString();
    // }
}

// if (strs == null || strs.length == 0) {
// return "";
// }

// int minLength = Integer.MAX_VALUE;

// // Find the minimum length among all strings in the array
// for (String str : strs) {
// minLength = Math.min(minLength, str.length());
// }

// StringBuilder commonPrefix = new StringBuilder();

// for (int i = 0; i < minLength; i++) {
// char currentChar = strs[0].charAt(i);

// // Compare the current character with the corresponding character in other
// strings
// for (int j = 1; j < strs.length; j++) {
// if (strs[j].charAt(i) != currentChar) {
// return commonPrefix.toString();
// }
// }

// commonPrefix.append(currentChar);
// }

// return commonPrefix.toString();
// }