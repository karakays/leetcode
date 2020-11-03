package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S210Test {

    S210 s210 = new S210();

    /* 3->2->1->0 */
    @Test
    public void test1() {
        int[][] prerequisites = {{3,2}, {2,1}, {1,0}};
        int[] expected = {0, 1, 2, 3};
        Assert.assertTrue(Arrays.equals(expected, s210.findOrder(4, prerequisites)));
    }

    @Test
    public void test2() {
        int[][] prerequisites = {{1,0}};
        int[] expected = {0, 1};
        Assert.assertTrue(Arrays.equals(expected, s210.findOrder(2, prerequisites)));
    }

    @Test
    public void test3() {
        int[][] prerequisites = {{1,0}, {2,0}, {3,1}, {3,2}};
        int[] expected = {0, 1, 2, 3};
        Assert.assertTrue(Arrays.equals(expected, s210.findOrder(4, prerequisites)));
    }

    @Test
    public void test4() {
        int[][] prerequisites = {};
        int[] expected = {0};
        Assert.assertTrue(Arrays.equals(expected, s210.findOrder(1, prerequisites)));
    }

    @Test
    public void test5() {
        int[][] prerequisites = {{0,1}};
        int[] expected = {1,0};
        Assert.assertTrue(Arrays.equals(expected, s210.findOrder(2, prerequisites)));
    }

    @Test
    public void test6() {
        int[][] prerequisites = {{1,0}, {0,1}};
        int[] expected = {};
        Assert.assertTrue(Arrays.equals(expected, s210.findOrder(2, prerequisites)));
    }

}
