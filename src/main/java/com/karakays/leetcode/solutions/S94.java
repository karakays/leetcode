package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S94 {

    public List<Integer> inorderTraversal(S104.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(S104.TreeNode root, List<Integer> list) {
        if(root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    private void inorder_iterative(S104.TreeNode root, List<Integer> list) {

    }
}
