package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class S169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majority = 0;
        int major = 0;
        for (int n : nums) {
            int m = map.getOrDefault(n, 0) + 1;
            map.put(n, m);
            if(m > majority) {
                majority = m;
                major = n;
            }
        }
        return major;
    }
}
