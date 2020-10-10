package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class S268 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len * (len + 1) / 2;
        for(int i : nums) {
            sum -= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(1 ^ 3 ^  1);
    }
}
