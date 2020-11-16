package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;

import java.util.*;

public class S103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagOrder = new ArrayList<>();
        Map<Integer, List<Integer>> treeMap = new HashMap<>();
        int level = 0;
        traverseByLevel(root, level, treeMap);
        boolean zigzag = false;
        while(treeMap.containsKey(level)) {
            List<Integer> list = treeMap.get(level++);
            if(zigzag) {
                Collections.reverse(list);
            }
            zigzagOrder.add(list) ;
            zigzag ^= true;
        }
        return zigzagOrder;
    }

    public void traverseByLevel(TreeNode root, int level, Map<Integer,List<Integer>> treeMap) {
        if(root != null) {
            if(!treeMap.containsKey(level)) {
                treeMap.put(level, new ArrayList<>());
            }
            treeMap.get(level).add(root.val);
            traverseByLevel(root.left, ++level, treeMap);
            traverseByLevel(root.right, level, treeMap);
        }
    }


}
