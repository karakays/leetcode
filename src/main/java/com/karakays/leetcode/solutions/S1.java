package com.karakays.leetcode.solutions;

import java.util.stream.Stream;

public class S1 {
   
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length && !found; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                    found = true;
                    break;
                }
            }
        }
        return sum;
    }
}
