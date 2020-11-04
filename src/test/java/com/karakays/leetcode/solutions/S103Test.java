package com.karakays.leetcode.solutions;

import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S103Test {

    S103 s103 = new S103();

    @Test
    public void test1() {
        S104.TreeNode node = BinaryTreeUtils.buildTreeFromList(15, 10, 20, 16, 21, 22);
        Map<Integer, List<Integer>> treeMap = new HashMap<>();
        s103.traverseByLevel(node, 0, treeMap);
        Assert.assertEquals(4, treeMap.keySet().size());
        Assert.assertEquals(Arrays.asList(16, 21), treeMap.get(2));
        Assert.assertEquals(Arrays.asList(10, 20), treeMap.get(1));
    }

    @Test
    public void test2() {
        S104.TreeNode node = BinaryTreeUtils.buildTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> list = s103.zigzagLevelOrder(node);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Arrays.asList(3), list.get(0));
        Assert.assertEquals(Arrays.asList(20, 9), list.get(1));
        Assert.assertEquals(Arrays.asList(15, 7), list.get(2));
    }

    @Test
    public void test3() {
        S104.TreeNode node = BinaryTreeUtils.buildTreeFromArray(new Integer[]{3});
        List<List<Integer>> list = s103.zigzagLevelOrder(node);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(Arrays.asList(3), list.get(0));
    }
}
