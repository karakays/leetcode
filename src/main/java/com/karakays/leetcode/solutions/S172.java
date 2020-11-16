package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class S172 {
    public int trailingZeroes(int n) {
        int z = 0;
        while((n / 5) != 0) {
            n /= 5;
            z += n;
        }
        return z;
    }
}
