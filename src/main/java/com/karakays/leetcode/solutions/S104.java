package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

public class S104 {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = maxDepth(root.left) + 1;

        int right = maxDepth(root.right) + 1;

        return left > right ? left : right;
    }
}
