package com.karakays.leetcode.solutions;

public class S69 {
    public int mySqrt(int x) {
        if(x < 2) return x;
        return mySqrt(x, 1, x);
    }

    private int mySqrt(int x, int low, int high) {
        int delta = (high - low) / 2;
        int med = low + delta;

        if(med == x / med) {
            return med;
        } else if(delta == 0) {
            return low;
        } else if(med > x / med) {
            return mySqrt(x, low, med);
        } else {
            return mySqrt(x, med, high);
        }
    }
}
