package com.karakays.leetcode.solutions;

import java.util.stream.Stream;

public class S14 {
    public String longestCommonPrefix_(String[] strs) {
        String minStr = null;
        for (String s : strs) {
            if (minStr == null) {
                minStr = s;
            } else if (minStr.length() > s.length()) {
                minStr = s;
            }
        }

        for (int i = 0; minStr != null && i < minStr.length(); i++) {
            Character c = null;
            for (String s : strs) {
                if (c == null) {
                    c = s.charAt(i);
                } else if (i >= s.length() || !c.equals(s.charAt(i))) {
                    return s.substring(0, i);
                }
            }
        }

        return minStr != null ? minStr : "";
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length > 0) {
            String pivot = strs[0];
            int i = 0;
            for (; i < pivot.length(); i++) {
                Character c = pivot.charAt(i);
                for (String s : strs) {
                    if (i >= s.length() || !c.equals(s.charAt(i))) {
                        return pivot.substring(0, i);
                    }
                }
            }
            return pivot.substring(0, i);
        } else {
            return "";
        }
    }
}
