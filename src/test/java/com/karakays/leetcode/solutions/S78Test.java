package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S78Test {

    S78 s78 = new S78();

    @Test
    public void test1() {
        int[] nums = {1,2,3};
        Assert.assertEquals(8, s78.subsets(nums).size());
    }

    @Test
    public void test2() {
        int[] nums = {1};
        Assert.assertEquals(2, s78.subsets(nums).size());
    }

    @Test
    public void test3() {
        int[] nums = {};
        Assert.assertEquals(1, s78.subsets(nums).size());
    }

}
