package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class S46Test {

    S46 s46 = new S46();

    @Test
    public void test1() {
        int[] nums = {1,2,3};
        List<List<Integer>> perms = s46.permute(nums);
        Assert.assertEquals(6, perms.size());
    }

    @Test
    public void test2() {
        int[] nums = {6,7,8,9,10};
        List<List<Integer>> perms = s46.permute(nums);
        Assert.assertEquals(120, perms.size());
    }

    @Test
    public void test3() {
        int[] nums = {3};
        List<List<Integer>> perms = s46.permute(nums);
        Assert.assertEquals(1, perms.size());
    }

}
