package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S104.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S118Test {

    S118 s118 = new S118();

    @Test
    public void test0() {
        List<List<Integer>> list = s118.generate(5);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(Arrays.asList(1), list.get(0));
        Assert.assertEquals(Arrays.asList(1,1), list.get(1));
        Assert.assertEquals(Arrays.asList(1,2,1), list.get(2));
        Assert.assertEquals(Arrays.asList(1,3,3,1), list.get(3));
        Assert.assertEquals(Arrays.asList(1,4,6,4,1), list.get(4));
    }

    @Test
    public void test1() {
        List<List<Integer>> list = s118.generate(0);
        Assert.assertEquals(0, list.size());
    }

}
