package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S104Test {

    S104 s104;

    @Before
    public void init() {
        s104 = new S104();
    }

    @Test
    public void test1() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        int maxDepth = s104.maxDepth(root);
        Assert.assertEquals(maxDepth, 3);
    }

    @Test
    public void test2() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4});
        int maxDepth = s104.maxDepth(root);
        Assert.assertEquals(maxDepth, 4);
    }
}
