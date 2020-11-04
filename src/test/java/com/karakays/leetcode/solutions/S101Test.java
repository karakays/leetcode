package com.karakays.leetcode.solutions;

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
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test1() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,3,4,4,3});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test2() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,null,3,null,3});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

    @Test
    public void test3() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

    @Test
    public void test4() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,2,null,2, null});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

    @Test
    public void test5() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test6() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test7() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,2,null,3,3, null});
        boolean result = s101.isSymmetric(root);
        Assert.assertTrue(result);
    }

    @Test
    public void test8() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1,2,3});
        boolean result = s101.isSymmetric(root);
        Assert.assertFalse(result);
    }

}
