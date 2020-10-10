package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class S125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for(int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
