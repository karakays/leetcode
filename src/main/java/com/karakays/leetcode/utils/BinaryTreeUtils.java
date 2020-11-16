package com.karakays.leetcode.utils;

import com.karakays.leetcode.domain.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeUtils {

    public static TreeNode minimum(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    /**
     * in-order successsor
     * @param root
     * @param node MUST exist
     * @return
     */
    public static TreeNode successor(TreeNode root, TreeNode node) {
        TreeNode successor = null;
        if(node.right != null) {
            successor = minimum(node.right);
        } else {
            while(root != null) {
                if (node.val < root.val) {
                    successor = root;
                    root = root.left;
                } else if (node.val > root.val) {
                    root = root.right;
                } else {
                    break;
                }
            }
        }
        return successor;
    }

    /**
     * Traver in-order
     * @param node can be null
     * @param tree cannot be null
     */
    public static void traverse(TreeNode node, List<Integer> tree) {
        if(node != null) {
            traverse(node.left, tree);
            tree.add(node.val);
            traverse(node.right, tree);
        }
    }

    public static void traversePreOrder(TreeNode node, List<Integer> tree) {
        if(node != null) {
            tree.add(node.val);
            traversePreOrder(node.left, tree);
            traversePreOrder(node.right, tree);
        }
    }

    public static void traversePostOrder(TreeNode node, List<Integer> tree) {
        if(node != null) {
            traversePostOrder(node.left, tree);
            traversePostOrder(node.right, tree);
            tree.add(node.val);
        }
    }

    public static TreeNode search(TreeNode root, int i){
        if(root == null) {
            return null;
        } else if (root.val == i) {
            return root;
        } else if(root.val > i) {
            return search(root.left, i);
        } else {
            return search(root.right, i);
        }
    }

    /**
     *
     * @param root of tree to insert to
     * @param val of the new node
     * @return root of the tree
     */
    public static TreeNode insert(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    /**
     *
     * @param root of tree to insert to
     * @param val of the new node
     * @return the new node that is just inserted
     */
    public static TreeNode insertAndReturn(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        TreeNode node;
        if(val < root.val) {
            node = insertAndReturn(root.left, val);
            if(root.left == null) root.left = node;
        } else {
            node = insertAndReturn(root.right, val);
            if(root.right == null) root.right = node;
        }

        return node;
    }

    /**
     * Builds a new tree where each value from array is inserted in order
     * @param values
     * @return root of the tree
     */
    public static TreeNode buildTreeFromList(int... values) {
        TreeNode root = null;
        for(int val: values) {
            root = insert(root, val);
        }
        return root;
    }

    /**
     * Builds a new tree where each index in values corresponds to node number
     * started from root with 0 and carried on from left to right in the tree
     * @param values
     * @return
     */
    public static TreeNode buildTreeFromArray(Integer[] values) {
        if(values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);

        for (int i = 0; i < (values.length) / 2; i++) {
            if(values[i] != null) {
                TreeNode currentParent = tree.poll();
                if (values[(i * 2) + 1] != null) {
                    TreeNode left = new TreeNode(values[(i * 2) + 1]);
                    currentParent.setLeft(left);
                    tree.add(left);
                }
                if (values[(i * 2) + 2] != null) {
                    TreeNode right = new TreeNode(values[(i * 2) + 2]);
                    currentParent.setRight(right);
                    tree.add(right);
                }
            }
        }
        return root;
    }

}
