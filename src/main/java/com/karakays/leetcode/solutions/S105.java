package com.karakays.leetcode.solutions;

import com.karakays.leetcode.utils.BinaryTreeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S105 {
    public boolean isValidBST(S104.TreeNode root) {
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);

        Integer prev = null;

        for(int i: treeAsList) {
            if(prev != null && prev >= i) {
                return false;
            }
            prev = i;
        }
        return true;
    }
}
