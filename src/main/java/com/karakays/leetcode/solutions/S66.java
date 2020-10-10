package com.karakays.leetcode.solutions;

import java.util.Arrays;

public class S66 {
    public int[] plusOne(int[] digits) {
        int s = 1;
        for (int i = digits.length - 1; i >= 0 && s > 0; i--) {
            int d = digits[i] + 1;
            digits[i] = d % 10;
            s = d / 10;
        }
        if(s > 0) {
            int[] d = new int[digits.length + 1];
            d[0] = 1;
            return d;
        } else {
            return digits;
        }
    }
}
