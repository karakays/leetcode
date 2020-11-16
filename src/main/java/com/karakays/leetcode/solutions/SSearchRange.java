package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class SSearchRange {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int low =  lowerBound(nums, 0, nums.length - 1, target);
        int high =  higherBound(nums, 0, nums.length - 1, target);
        return new int[]{low, high};
    }

    private int lowerBound(int[] nums, int low, int high, int k) {
        if(low > high) {
            return -1;
        }
        int med = (low + high) / 2;
        if((med == 0 || (nums[med - 1] < nums[med])) && nums[med] == k) {
            return med;
        } else if(nums[med] < k) {
            return lowerBound(nums, med + 1, high, k);
        } else {
            return lowerBound(nums, low, med - 1, k);
        }
    }

    private int higherBound(int[] nums, int low, int high, int k) {
        if(low > high) {
            return -1;
        }
        int med = (low + high) / 2;
        if((med == nums.length - 1 || (nums[med + 1] > nums[med])) && nums[med] == k) {
            return med;
        } else if(k < nums[med]) {
            return higherBound(nums, low, med - 1, k);
        } else {
            return higherBound(nums, med + 1, high, k);
        }
    }
}
