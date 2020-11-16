package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class S56Test {

    S56 s56 = new S56();

    @Test
    public void test1() {
        int[][] in = {{1,3},{2,6},{8,10},{15,18}};
        int[][] out = {{1,6},{8,10},{15,18}};
        Assert.assertArrayEquals(out, s56.merge(in));
    }

    @Test
    public void test2() {
        int[][] in = {{1,3},{3,5},{5,7},{7,9}};
        int[][] out = {{1,9}};
        Assert.assertArrayEquals(out, s56.merge(in));
    }

    @Test
    public void test3() {
        int[][] in = {{1,3},{4,6},{7,8}};
        int[][] out = {{1,3},{4,6},{7,8}};
        Assert.assertArrayEquals(out, s56.merge(in));
    }

    @Test
    public void test4() {
        int[][] in = {{1,3}};
        int[][] out = {{1,3}};
        Assert.assertArrayEquals(out, s56.merge(in));
    }

    @Test
    public void test5() {
        int[][] in = {};
        int[][] out = {};
        Assert.assertArrayEquals(out, s56.merge(in));
    }

    @Test
    public void test6() {
        int[][] in = {{1,4},{0,4}};
        int[][] out = {{0,4}};
        Assert.assertArrayEquals(out, s56.merge(in));
    }

}
