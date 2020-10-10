package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S326 {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        int j = 1, i = 1;
        while(i < n && i > 0) {
            i *= 3;
            System.out.printf("%s i=%s%n", j++, i);
        }
        return i == n;
    }

    public boolean isPowerOfThree_(int n) {
        while((n % 3) == 0) {
            System.out.printf("n=%s%n", n);
            n /= 3;
        }
        return n == 1;
    }

}
