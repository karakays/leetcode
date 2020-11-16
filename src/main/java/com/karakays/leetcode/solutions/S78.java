package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets(subsets, nums, 0, new boolean[nums.length]);
        return subsets;
    }

    public void subsets(List<List<Integer>> list, int[] nums, int k, boolean[] elems) {
        if(k == elems.length) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) if(elems[i]) subset.add(nums[i]);
            list.add(subset);
        } else {
            elems[k] = false;
            subsets(list, nums, k + 1, elems);
            elems[k] = true;
            subsets(list, nums, k + 1, elems);
            elems[k] = false;
        }
    }

    public List<List<Integer>> _subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        S78 s78 = new S78();
        int[] i = {1,2,3};
        s78._subsets(i);
    }
}
