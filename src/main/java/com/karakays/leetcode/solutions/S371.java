package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S371 extends Base {
    public int getSum(int a, int b) {
        int sum = a;
        int carry = b;

        while(carry != 0) {
            int s = sum ^ carry;
            int c = sum & carry;
            sum = s;
            carry = c;
            carry <<= 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        S371 s = new S371();

        System.out.println(s.getSum(6,3));
        System.out.println(s.getSum(27,3));
        System.out.println(s.getSum(9,1));

        System.out.println(13 ^ 13);

        int b = 0b1100000_00000000_00000000_000001111;

        System.out.printf("b = %d, %s%n", b, format(b));
        System.out.printf("b>>1 = %d, %s%n", b>>1, format(b>>1));
        System.out.printf("b>>2 = %d, %s%n", b>>2, format(b>>2));
        System.out.printf("b>>3 = %d, %s%n", b>>3, format(b>>3));
        System.out.printf("%d, %s%n", b>>>1, format(b>>>1));



        b = -10;
        System.out.printf("b<<0 = %d, %s%n", b<<0, format(b<<0));
        System.out.printf("b<<1 = %d, %s%n", b<<1, format(b<<1));
        System.out.printf("b<<2 = %d, %s%n", b<<2, format(b<<2));
        System.out.printf("b<<4 = %d, %s%n", b<<4, format(b<<4));



    }


    public static String format(int i) {
        return String.format("%32s", Integer.toBinaryString(i)).replace(" ", "0");
    }


}
