package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;

public class S108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return insert(null, nums, 0, nums.length - 1);
    }

    public TreeNode _sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return _insert(nums, 0, nums.length - 1);
    }

    private TreeNode insert(TreeNode root, int nums[], int start, int end) {
        int med = (end - start) / 2;
        int current = start + med;
        root = BinaryTreeUtils.insert(root, nums[current]);
        if (med > 0) insert(root, nums, start, current - 1);
        if (current + 1 <= end) insert(root, nums, current + 1, end);
        return root;
    }

    /**
     * more clean solution without additional insert method
     * @param nums
     * @param start
     * @param end
     * @return
     */
    private TreeNode _insert(int nums[], int start, int end) {
        int med = (end - start) / 2;
        int current = start + med;
        TreeNode root = new TreeNode(nums[current]);
        if (med > 0) root.left = _insert(nums, start, current - 1);
        if (current + 1 <= end) root.right = _insert(nums, current + 1, end);
        return root;
    }

}
