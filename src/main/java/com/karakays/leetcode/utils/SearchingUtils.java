package com.karakays.leetcode.utils;

public class SearchingUtils {

    /**
     * Binary search iterative
     *
     * @param n
     * @param k
     * @return
     */
    public int search(int[] n, int k) {
        int low = 0, high = n.length - 1;
        while (low <= high) {
            int med = (low + high) / 2;
            if (n[med] == k) return med;
            else if (n[med] > k) {
                high = med - 1;
            } else {
                low = med + 1;
            }
        }
        return -1;
    }

    /**
     * Binary search recursive
     *
     * @param n
     * @param k
     * @return
     */
    public int search(int[] n, int k, int low, int high) {
        if (high < low) return -1;
        int med = (low + high) / 2;
        if (n[med] == k) {
            return med;
        } else if (k < n[med]) {
            return search(n, k , low, med - 1);
        } else {
            return search(n, k , med + 1, high);
        }
    }

    /**
     * Return pivot index where nums[index] is rotated
     * @param nums sorted array rotated at some index
     * @return
     */
    public int findPivot(int[] nums) {
        int low = 0, high = nums.length - 1;

        while(low < high) {
            int med = (low + high) / 2;
            if(nums[high] < nums[med]) {
                low = med + 1;
            } else {
                // don't skip current med as it could be the pivot here
                high = med;
            }
        }
        // assert low == high;

        return low;
    }
}
