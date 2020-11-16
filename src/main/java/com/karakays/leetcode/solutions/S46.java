package com.karakays.leetcode.solutions;

import java.util.*;
import java.util.stream.Collectors;

public class S46 extends Base {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        int[] arr = new int[nums.length];
        permute(perms, nums, arr, 0);
        return perms;
    }

    private void permute(List<List<Integer>> result, int[] in, int[] nums, int k) {
        if(k == in.length) {
            List<Integer> l = Arrays.stream(nums).boxed().collect(Collectors.toList());
            result.add(l);
        } else {
            Set<Integer> candidates = new HashSet<>();
            for (int i: in) candidates.add(i);
            for (int i = 0; i < k ; i++) candidates.remove(nums[i]);
            for (Integer i : candidates) {
                nums[k] = i;
                permute(result, in, nums, k + 1);
            }
        }
    }

}
