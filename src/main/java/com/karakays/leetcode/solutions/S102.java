package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S102 {
    private List<List<Integer>> levels = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return levels;
    }

    public void traverse(TreeNode root, int level) {
        if(root != null) {
            List<Integer> nodesAtLevel = (level > levels.size() - 1) ? new ArrayList<>() : levels.get(level);
            if(nodesAtLevel.size() == 0) levels.add(level, nodesAtLevel);
            nodesAtLevel.add(root.val);
            level += 1;
            traverse(root.left, level);
            traverse(root.right, level);
        }
    }

}
