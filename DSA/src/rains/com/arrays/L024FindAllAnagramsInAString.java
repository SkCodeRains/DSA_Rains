package rains.com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L024FindAllAnagramsInAString {
    public static void main(String[] args) {
        String str = "abab", p = "ab";
        List<Integer> ans = findAnagrams(str, p);
        // System.out.println(ans);
        Solutionaa bj = new Solutionaa();
        ans = bj.findAnagrams(str, p);
        System.out.println(ans);

    }

    private static List<Integer> findAnagrams(String s, String p) {
        int pl = p.length();
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pmap = new HashMap<>(pl);
        Map<Character, Integer> smap = new HashMap<>(pl);
        if (pl > s.length()) {
            return result;
        }
        for (int i = 0; i < pl; i++) {
            char ch = p.charAt(i), ch2 = s.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
            smap.put(ch2, smap.getOrDefault(ch2, 0) + 1);
        }
        for (int i = pl; i < s.length(); i++) {
            if (isAnagram(pmap, smap)) {
                result.add(i - pl);
            }
            char ch = s.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            ch = s.charAt(i - pl);
            if (smap.get(ch) == 1) {
                smap.remove(ch);
            } else {
                smap.put(ch, smap.getOrDefault(ch, 0) - 1);
            }
        }
        if (isAnagram(pmap, smap)) {
            result.add(s.length() - pl);
        }
        /*
         * if (isAnagram(pmap, smap)) {
         * result.add(s.length() - k);
         * }
         */
        return result;
    }

    private static boolean isAnagram(Map<Character, Integer> pmap, Map<Character, Integer> smap) {
        for (char key : pmap.keySet()) {
            Integer value = pmap.get(key);
            if (smap.get(key) != value) {
                return false;
            }
        }

        return true;
    }

}

class Solutionaa {
    public List<Integer> findAnagrams(String s, String p) {
        // Your code goes here
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length())
            return result;
        int[] charCountP = new int[26];
        int[] charCountS = new int[26];

        int windowSize = p.length();
        for (int i = 0; i < windowSize; i++) {
            charCountS[s.charAt(i) - 'a']++;
            charCountP[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - windowSize; i++) {

            boolean res = true;
            inner: for (int j = 0; j < 26; j++) {
                if (charCountS[j] != charCountP[j]) {
                    res = false;
                    break inner;
                }
            }

            if (res) {
                result.add(i);
            }

            if (i + windowSize < s.length()) {
                charCountS[s.charAt(i) - 'a']--;
                charCountS[s.charAt(i + windowSize) - 'a']++;
            }
        }

        return result;
    }
}