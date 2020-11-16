package com.karakays.leetcode.solutions;

public class S162 {
    public int findPeakElement(int[] nums) {
        return find(nums, 0, nums.length - 1);
    }

    public int find(int[] nums, int low, int high) {
        int med = (low + high) / 2;
        boolean lowAsc = (med == 0 || nums[med - 1] < nums[med]);
        boolean highDesc = (med == (nums.length - 1) || nums[med] > nums[med + 1]);
        if(lowAsc && highDesc) {
            return med;
        } else if(lowAsc) {
            return find(nums, med + 1, high);
        } else {
            return find(nums, low, med - 1);
        }
    }

    public int _findPeakElement(int[] nums) {
        boolean asc = true;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < prev && asc) {
                return i - 1;
            } else {
                asc = prev < nums[i];
                prev = nums[i];
            }
        }
        return asc ? nums.length - 1 : 0;
    }
}
