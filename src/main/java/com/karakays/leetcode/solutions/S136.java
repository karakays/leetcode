package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S136 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public int singleNumber_naive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : nums) {
            if (set.contains(i)) {
                sum -= i;
                set.remove(i);
            } else {
                sum += i;
                set.add(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(13 ^ 1 ^ 1 ^ 13 ^ 3);
        System.out.println(4 ^ 1 ^ 2 ^ 1 ^ 2);
    }
}