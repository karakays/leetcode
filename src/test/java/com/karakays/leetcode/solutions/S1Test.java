package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class S1Test {

    S1 s1 = new S1();

    @Test
    public void test1() {
        int[] nums = {3, 2, 4};
        int[] exp = {1, 2};
        int[] act = s1.twoSum(nums, 6);
        Arrays.sort(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test2() {
        int[] nums = {2,7,11,15};
        int[] exp = {0,1};
        int[] act = s1.twoSum(nums, 9);
        Arrays.sort(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test3() {
        int[] nums = {3,3};
        int[] exp = {0,1};
        int[] act = s1.twoSum(nums, 6);
        Arrays.sort(act);
        Assert.assertArrayEquals(exp, act);
    }


}
