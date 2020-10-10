package com.karakays.leetcode.solutions;

import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class S102Test {

    S102 s102;

    @Before
    public void init() {
        s102 = new S102();
    }

    @Test
    public void test1() {
        S104.TreeNode root = BinaryTreeUtils.buildTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> levels = s102.levelOrder(root);
        System.out.println(levels);
    }
}
