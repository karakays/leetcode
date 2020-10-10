package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S28Test {

    S28 s28 = new S28();

    @Test
    public void test1() {
        Assert.assertEquals(2, s28.strStr("hello", "ll"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(-1, s28.strStr("aaaaa", "bba"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, s28.strStr("", ""));
    }

    @Test
    public void test4() {
        Assert.assertEquals(5, s28.strStr("ababzbccdef", "bc"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(0, s28.strStr("a", "a"));
    }
}
