package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S101Test {

    S101 s101;

    @Before
    public void init() {
        s101 = new S101();
    }

    @Test
    public void test0() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test1() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,3,4,4,3});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,null,3,null,3});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

    @Test
    public void test4() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,2,null,2, null});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

    @Test
    public void test5() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test6() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test7() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,null,3,3, null});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test8() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,3});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

}
