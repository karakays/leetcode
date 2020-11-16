package com.karakays.leetcode.solutions;

import com.karakays.leetcode.domain.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S105Test {

    S105 s105;

    @Before
    public void init() {
        s105 = new S105();
    }

    @Test
    public void test1() {
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        boolean result = s105.isValidBST(root);
        Assert.assertFalse(result);
    }
}
