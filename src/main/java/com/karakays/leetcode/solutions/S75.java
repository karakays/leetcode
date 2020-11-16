package com.karakays.leetcode.solutions;

public class S75 {
    public void sortColors(int[] nums) {
        int index = 0, p0 = 0, p2 = nums.length  - 1;
        while(index <= p2) {
            if(nums[index] == 0) {
                swap(nums, p0, index);
                p0++;
            }

            if(nums[index] == 2) {
                swap(nums, p2, index);
                p2--; index--;
            }
            index++;
        }
    }

    private void swap(int[] n, int i, int j){
        int tmp = n[i];
        n[i] = n[j];
        n[j] = tmp;
    }

    public void _sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int low, int high) {
        if(low < high) {
            int p = partition(nums, low, high);
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int firstHigh = low;
        for (int i = low; i < high; i++) {
            if(nums[i] < pivot) {
                int tmp = nums[firstHigh];
                nums[firstHigh] = nums[i];
                nums[i] = tmp;
                firstHigh += 1;
            }
        }
        int tmp = nums[firstHigh];
        nums[firstHigh] = nums[high];
        nums[high] = tmp;
        return firstHigh;
    }
}
