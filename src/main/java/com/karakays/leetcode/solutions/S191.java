package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;

import java.util.HashSet;
import java.util.Set;

public class S191 {
    public int hammingWeight(int n) {
        int i = 0;
        while(n != 0x00) {
            if((0x01 & n) == 0x01) i++;
            n >>>= 1;
        }
        return i;
    }

}
