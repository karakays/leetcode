package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if(root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    private void inorder_iterative(TreeNode root, List<Integer> list) {

    }
}
