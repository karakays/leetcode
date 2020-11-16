package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S230Test {

    S230 s230 = new S230();

    @Test
    public void test1() {
        Integer[] tree = {3,1,4,null,2};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(tree);
        Assert.assertEquals(1, s230.kthSmallest(root, 1));
    }

    @Test
    public void test2() {
        Integer[] tree = {5,3,6,2,4,null,null,1,null};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(tree);
        Assert.assertEquals(3, s230.kthSmallest(root, 3));
    }

    @Test
    public void test3() {
        Integer[] tree = {3,1,4,null,2};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(tree);
        Assert.assertEquals(1, s230.kthSmallest_iterative(root, 1));
    }

    @Test
    public void test4() {
        Integer[] tree = {5,3,6,2,4,null,null,1,null};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(tree);
        Assert.assertEquals(3, s230.kthSmallest_iterative(root, 3));
    }

}
