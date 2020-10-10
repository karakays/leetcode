package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S104.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S118 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 1) {
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> list = init(numRows);
        for (int i = 2; i < numRows; i++) {
            List<Integer> prev = list.get(i - 1);
            List<Integer> curr = list.get(i);
            for (int j = 1; j <= i - 1 ; j++) {
                curr.add(j, prev.get(j - 1) + prev.get(j));
            }
        }
        return list;
   }

    private List<List<Integer>> init(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        subList.add(1); list.add(subList);
        for (int i = 2; i <= n; i++) {
            subList = new ArrayList<>();
            subList.add(1);
            subList.add(1);
            list.add(subList);
        }
        return list;
    }
}
