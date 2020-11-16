package com.karakays.leetcode.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SearchingUtilsTests {
    private SearchingUtils utils = new SearchingUtils();

    @Test
    public void test1() {
        int n[] = {12, 13, 14, 15, 16, 17};
        Assert.assertEquals(3, utils.search(n, 15));
        Assert.assertEquals(3, utils.search(n, 15, 0, n.length - 1));
    }

    @Test
    public void test2() {
        int n[] = {12, 13, 14, 15, 16, 17};
        Assert.assertEquals(0, utils.search(n, 12));
        Assert.assertEquals(0, utils.search(n, 12, 0, n.length - 1));
    }

    @Test
    public void test3() {
        int n[] = {12, 13, 14, 15, 16, 17};
        Assert.assertEquals(5, utils.search(n, 17));
        Assert.assertEquals(5, utils.search(n, 17, 0, n.length - 1));
    }

    @Test
    public void test4() {
        int n[] = {12, 13, 14, 15, 16, 17};
        Assert.assertEquals(-1, utils.search(n, 0));
        Assert.assertEquals(-1, utils.search(n, 0, 0, n.length - 1));
    }

    @Test
    public void test5() {
        int n[] = {12, 13, 14, 15, 16, 17};
        Assert.assertEquals(-1, utils.search(n, 26));
        Assert.assertEquals(-1, utils.search(n, 26, 0, n.length - 1));
    }

    @Test
    public void testPivot2() {
        int n[] = {12, 13, 14, 15, 16, 17};
        Assert.assertEquals(0, utils.findPivot(n));
    }

    @Test
    public void testPivot3() {
        int n[] = {12, 13, 14, 1, 2, 3};
        Assert.assertEquals(3, utils.findPivot(n));
    }

    @Test
    public void testPivot4() {
        int n[] = {12, 13, 14, 1};
        Assert.assertEquals(3, utils.findPivot(n));
    }

    @Test
    public void testPivot5() {
        int n[] = {5,1,3};
        Assert.assertEquals(1, utils.findPivot(n));
    }

}
