package com.karakays.leetcode.solutions;

import java.util.*;

public class S50 extends Base {
    public double myPow(double x, int n) {
        if(x == 1.0 || x == -1.0) return x;
        if(x == 1.0) return x;
        else if(x == -1.0) return n % 2 == 0 ?  1.0 : -1.0;
        double i = 1;
        if(n > 0) {
            while(n-- > 0) i *= x;
        } else {
            while((i != 0.0) && n++ < 0) {
                i /= x;
            }
        }
        return i;
    }
}
