package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S215 extends Base {
    public int findKthLargest(int[] nums, int k) {
        log.info("Looking for {}th largest from initial {}", k, Arrays.toString(nums));
        quickselect(nums, nums.length - k, nums.length - 1, 0);
        int kth = nums[nums.length - k];
        return kth;
    }

    private void quickselect(int[] nums, int kth, int high, int low) {
        int i = partition(nums, high, low);
        log.info("n[{}]={} array={}", i, nums[i], Arrays.toString(nums));

        if(i == kth) {
            return;
        } else if(i < kth) {
            quickselect(nums, kth, high, i + 1);
        } else {
            quickselect(nums, kth, i - 1, low);
        }
    }

    private int partition(int[] nums, int high, int low) {
        int pivot = nums[high], firstHighest = low;
        for (int i = low; i < high; i++) {
            if(nums[i] < pivot) {
                swap(nums, firstHighest++, i);
            }
        }
        swap(nums, firstHighest, high);
        return firstHighest;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
