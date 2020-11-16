package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S108Test {

    S108 s108;

    @Before
    public void init() {
        s108 = new S108();
    }

    @Test
    public void test0() {
        TreeNode root = s108.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(-10, -3, 0, 5, 9), treeAsList);
        Assert.assertEquals(0, root.val);
    }

    @Test
    public void test1() {
        TreeNode root = s108.sortedArrayToBST(new int[]{1, 3});
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(1,3), treeAsList);
        Assert.assertEquals(1, root.val);
    }

    @Test
    public void test2() {
        TreeNode root = s108.sortedArrayToBST(new int[]{1,2,3});
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(1,2,3), treeAsList);
        Assert.assertEquals(2, root.val);
    }

    @Test
    public void test3() {
        TreeNode root = s108._sortedArrayToBST(new int[]{-10,-3,0,5,9});
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(-10, -3, 0, 5, 9), treeAsList);
        Assert.assertEquals(0, root.val);
    }

    @Test
    public void test4() {
        TreeNode root = s108._sortedArrayToBST(new int[]{1, 3});
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(1,3), treeAsList);
        Assert.assertEquals(1, root.val);
    }

    @Test
    public void test5() {
        TreeNode root = s108._sortedArrayToBST(new int[]{1,2,3});
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(1,2,3), treeAsList);
        Assert.assertEquals(2, root.val);
    }

}
