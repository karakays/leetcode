package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class S230 {
    public int kthSmallest_iterative(TreeNode root, int k) {
        Deque<TreeNode> stack = new LinkedList<>();
        while(true) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if(--k == 0) {
                return node.val;
            }
            node = node.right;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        TreeNode min = minimum(root);
        while (--k > 0) {
            min = successor(root, min);
        }
        return min.val;
    }

    public TreeNode successor(TreeNode root, TreeNode node) {
        if(node.right != null) {
            return minimum(node.right);
        } else {
            TreeNode successor = null;
            while(root != null) {
                if(node.val < root.val) {
                    successor = root;
                    root = root.left;
                } else if(node.val > root.val) {
                    root = root.right;
                } else {
                    break;
                }
            }
            return successor;
        }
    }

    public TreeNode minimum(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
}
