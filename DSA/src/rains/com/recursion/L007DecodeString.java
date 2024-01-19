package rains.com.recursion;

import java.util.Stack;

public class L007DecodeString {
    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";

        System.out.println(decodeString(s1)); // Output: "aaabcbc"
    }

    private static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentResult = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                resultStack.push(currentResult);
                count = 0;
                currentResult = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder temp = currentResult;
                currentResult = resultStack.pop();
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    currentResult.append(temp);
                }
            } else {
                currentResult.append(ch);
            }
        }

        return currentResult.toString();
    }

    private static void helper(int i, String s, char charAt) {
        int brO = 1, brC = 0;
        StringBuilder currentResult = new StringBuilder();
        for (int j = i + 1; j < s.length(); j++) {

        }
    }
}
