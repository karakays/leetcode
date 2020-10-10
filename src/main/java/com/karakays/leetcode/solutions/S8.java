package com.karakays.leetcode.solutions;

public class S8 {
    public int myAtoi(String s) {
        int i = 0;
        while(i < s.length() && ' ' == (s.charAt(i))) i++;
        s = s.substring(i);

        i = 0;
        int sign = 1;
        if(i < s.length() && s.charAt(i) == '-') {
            i++;
            sign = -1;
        } else if(i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        s = s.substring(i);

        i = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))) i++;

        if(i == 0) {
            // not a number
            return 0;
        }

        s = s.substring(0, i);
        int n = s.length();
        int t = 0;
        i = sign * (s.charAt(t++) - 48);
        while(t < n) {
            if(i > Integer.MAX_VALUE / 10) {
                return Integer.MAX_VALUE;
            } else if(i < Integer.MIN_VALUE / 10) {
                return Integer.MIN_VALUE;
            } else {
                i *= 10;
                int digit = s.charAt(t++) - 48;
                if((i == (Integer.MAX_VALUE - 7)) && digit > 7) {
                    return Integer.MAX_VALUE;
                } else if((i == (Integer.MIN_VALUE + 8)) && digit > 8) {
                    return Integer.MIN_VALUE;
                } else {
                    i = i + (sign * digit);
                }
            }
        }
        return i;
    }
}
