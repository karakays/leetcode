package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SSearchRangeTest {

    SSearchRange sSearchRange = new SSearchRange();

    @Test
    public void test1() {
        int[] in = {1,2,3,3,3,4,5,6,7,8,9};
        int[] out = {2,4};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 3));
    }

    @Test
    public void test2() {
        int[] in = {1,2,3,3,3,4,5,6,7,8,9,12,13};
        int[] out = {-1,-1};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 10));
    }

    @Test
    public void test3() {
        int[] in = {5,7,7,8,8,10};
        int[] out = {-1,-1};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 6));
    }

    @Test
    public void test4() {
        int[] in = {};
        int[] out = {-1,-1};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 0));
    }

    @Test
    public void test5() {
        int[] in = {1};
        int[] out = {-1,-1};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 2));
    }

    @Test
    public void test6() {
        int[] in = {1};
        int[] out = {0,0};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 1));
    }

    @Test
    public void test7() {
        int[] in = {5,7,8};
        int[] out = {2,2};
        Assert.assertArrayEquals(out, sSearchRange.searchRange(in, 8));
    }

}
