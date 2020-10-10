package com.karakays.leetcode.solutions;

import java.util.Formatter;

public class S190 {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        while(s.length() < 32) s = "0" + s;
        char[] c = s.toCharArray();

        for (int i = 0, j = 31; i < j; i++,j--) {
            char tmp = c[j];
            c[j] = c[i];
            c[i] = tmp;
        }

        return Integer.parseUnsignedInt(new String(c), 2);
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-1));


        System.out.println(Integer.toString(-1, 2));

    }

}
