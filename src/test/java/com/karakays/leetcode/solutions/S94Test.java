package com.karakays.leetcode.solutions;

import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S94Test {

    S94 s94 = new S94();

    @Test
    public void test1() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromList(5,4,7,1,1);
        List<Integer> list = s94.inorderTraversal(root);
        Assert.assertEquals(Arrays.asList(1,1,4,5,7), list);
    }

    @Test
    public void test2() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromList(5,4,7,6,9);
        List<Integer> list = new ArrayList<>();
        BinaryTreeUtils.traversePreOrder(root, list);
        System.out.println(list);

    }

}
