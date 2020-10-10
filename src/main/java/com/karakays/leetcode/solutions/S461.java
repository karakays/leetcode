package com.karakays.leetcode.solutions;

public class S461 {

    public int hammingDistance(int x, int y) {
        return hammingWeight(x ^ y);
    }

    private int hammingWeight(int x) {
        int w = 0;
        while(x != 0) {
            if((x & 0x01) == 0x01) w++;
            x >>>= 1;
        }
        return w;
    }
}
