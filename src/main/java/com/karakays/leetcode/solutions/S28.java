package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S28 {

    public int strStr(String haystack, String needle) {
        if((needle != null) && needle.length() == 0) {
            return 0;
        }
        for (int i = 0, j = 0; i <= haystack.length() - needle.length(); i++) {
            for (j = 0; j < needle.length() && needle.charAt(j) == haystack.charAt(i + j); j++);
            if(j == needle.length()) return i;
        }
        return -1;
    }
}
