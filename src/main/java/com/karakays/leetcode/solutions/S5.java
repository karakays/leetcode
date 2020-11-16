package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class S5 extends Base {

    private final Map<String, Boolean> map = new HashMap<>();

    public String longestPalindrome(String s) {
        String palindrome = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if(isPalindrome(sub) && sub.length() > palindrome.length()) {
                    palindrome = sub;
                }
            }
        }
        return palindrome;
    }

    private boolean isPalindrome(String s) {
        if(map.containsKey(s)) {
            return map.get(s);
        }
        char[] c = s.toCharArray();
        boolean palindrome = true;
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
            if(c[i] != c[j]) {
                palindrome = false;
                break;
            }
        }
        map.put(s, palindrome);
        return palindrome;
    }
}
