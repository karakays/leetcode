package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S101 {
    public boolean isSymmetric(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        System.out.println(list);
        for (int i = 0, j = list.size() - 1; i < j ; i++, j--) {
            if(!list.get(i).equals(list.get(j))) return false;
        }
        return true;
    }

    private TreeNode traverse(TreeNode node, List<Integer> tree) {
        if (node != null) {
            if(node.left == null && node.right == null) {
                tree.add(node.val);
                return node;
            }
            TreeNode left = traverse(node.left, tree);
            if (left == null) {
                tree.add(Integer.MAX_VALUE);
            }
            tree.add(node.val);
            TreeNode right = traverse(node.right, tree);
            if (right == null) {
                tree.add(Integer.MAX_VALUE);
            }
            return node;
        } else {
            return null;
        }
    }
}
