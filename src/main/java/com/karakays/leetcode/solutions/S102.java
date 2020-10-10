package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class S102 {
    private List<List<Integer>> levels = new ArrayList<>();

    public List<List<Integer>> levelOrder(S104.TreeNode root) {
        traverse(root, 0);
        return levels;
    }

    public void traverse(S104.TreeNode root, int level) {
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
