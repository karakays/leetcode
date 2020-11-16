package com.karakays.leetcode.solutions;

public class S33 {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low < high) {
            int med = (low + high) / 2;
            if(nums[high] < nums[med]) {
                low = med + 1;
            } else {
                high = med;
            }
        }
        return binarySearch(nums, target, low, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int k, int pivot, int low, int high) {
        if(high < low)  return -1;
        int med = (low + high) / 2;
        int logMed = (med + pivot) % nums.length;
        if(nums[logMed] == k) {
            return logMed;
        } else if(nums[logMed] > k) {
            return binarySearch(nums, k, pivot, 0, med - 1);
        } else {
            return binarySearch(nums, k, pivot, med + 1, high);
        }
    }
}
