package com.karakays.leetcode.solutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S349 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // space O(m)
        List<Integer> intersect = new ArrayList<>();
        // space O(m)
        Map<Integer, Integer> nums1Map = new HashMap<>();
        // O(m)
        for(int i : nums1) {
            int count = nums1Map.getOrDefault(i, 0);
            nums1Map.put(i, ++count);
        }
        // O(n)
        for(int i : nums2) {
            Integer count = nums1Map.remove(i);
            if(count != null) {
                intersect.add(i);
                count -= 1;
                if(count != 0) {
                    nums1Map.put(i, count);
                }
            }
        }
        return intersect.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersect_sorted(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++; j++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
