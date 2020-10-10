package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> chars = new HashMap<>();
        String longStr = null;
        String shortStr = null;
        if(s.length() > t.length()) {
            longStr = s;
            shortStr = t;
        } else {
            longStr = t;
            shortStr = s;
        }

        for(int i = 0; i < longStr.length(); i++) {
            Integer num = chars.getOrDefault(longStr.charAt(i), 0);
            chars.put(longStr.charAt(i), ++num);
        }

        for(int i = 0; i < shortStr.length(); i++) {
            Integer num = chars.get(shortStr.charAt(i));
            if(num == null) {
                return false;
            } else {
                if (--num == 0) {
                    chars.remove(shortStr.charAt(i));
                } else {
                    chars.put(shortStr.charAt(i), num);
                }
            }
        }
        return chars.size() == 0;
    }
}
