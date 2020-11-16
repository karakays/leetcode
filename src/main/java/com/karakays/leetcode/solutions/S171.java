package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class S171 {
    public int titleToNumber(String s) {
        int n = s.length();
        int number = 0;
        while(n > 0) {
            char c = s.charAt(s.length() - n);
            int charVal = c - 'A' + 1;
            number += (power(26, --n) * charVal);
        }
        return number;
    }

    private int power(int b, int n) {
        int i = 1;
        while(n-- > 0) i *= b;
        return i;
    }
}
