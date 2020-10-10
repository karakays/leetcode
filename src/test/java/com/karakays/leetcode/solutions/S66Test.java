package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S66Test {

    S66 s66 = new S66();

    @Test
    public void test1() {
        int[] in = {1, 2, 3};
        int[] exp = {1, 2, 4};
        Assert.assertArrayEquals(exp, s66.plusOne(in));
    }

    @Test
    public void test2() {
        int[] in = {1, 2, 9};
        int[] exp = {1, 3, 0};
        Assert.assertArrayEquals(exp, s66.plusOne(in));
    }

    @Test
    public void test3() {
        int[] in = {1, 9, 9};
        int[] exp = {2, 0, 0};
        Assert.assertArrayEquals(exp, s66.plusOne(in));
    }

    @Test
    public void test4() {
        int[] in = {9, 9, 9};
        int[] exp = {1, 0, 0, 0};
        Assert.assertArrayEquals(exp, s66.plusOne(in));
    }

    @Test
    public void test5() {
        int[] in = {0};
        int[] exp = {1};
        Assert.assertArrayEquals(exp, s66.plusOne(in));
    }

}
