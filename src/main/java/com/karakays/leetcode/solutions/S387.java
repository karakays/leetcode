package com.karakays.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;

public class S387 {
    public int firstUniqChar(String s) {
        Set<Character> chars = new HashSet<>();
        for(int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(chars.contains(c)) {
                continue;
            }
            for(j = i + 1; j < s.length(); j++) {
                if(c == s.charAt(j)) {
                    chars.add(c);
                    break;
                }
            }
            if(j == s.length()) {
                return i;
            }
        }
        return -1;
    }
}
