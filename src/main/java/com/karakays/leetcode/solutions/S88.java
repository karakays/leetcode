package com.karakays.leetcode.solutions;

import java.util.Arrays;

public class S88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1 = Arrays.copyOfRange(nums1, 0, m);
        int[] n2 = Arrays.copyOfRange(nums2, 0, n);

        int i = 0, j = 0, k = 0;

        while(i < m && j < n) {
            if(n1[i] < n2[j]) {
                nums1[k++] = n1[i++];
            } else {
                nums1[k++] = n2[j++];
            }
        }

        while(i < m) {
            nums1[k++] = n1[i++];
        }

        while(j < n) {
            nums1[k++] = n2[j++];
        }
    }
}
