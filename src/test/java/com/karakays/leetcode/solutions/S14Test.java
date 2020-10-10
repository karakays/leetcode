package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S14Test {

    S14 s14 = new S14();

    @Test
    public void test1() {
        String[] strs = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", s14.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        String[] strs = {"xflower", "xflow", "yflight"};
        Assert.assertEquals("", s14.longestCommonPrefix(strs));
    }

    @Test
    public void test3() {
        String[] strs = {"xflower", "", "xflight"};
        Assert.assertEquals("", s14.longestCommonPrefix(strs));
    }

    @Test
    public void test4() {
        String[] strs = {};
        Assert.assertEquals("", s14.longestCommonPrefix(strs));
    }

    @Test
    public void test5() {
        String[] strs = {"abc", "abc", "abc"};
        Assert.assertEquals("abc", s14.longestCommonPrefix(strs));
    }

    @Test
    public void test6() {
        String[] strs = {"abc"};
        Assert.assertEquals("abc", s14.longestCommonPrefix(strs));
    }

    @Test
    public void test7() {
        String[] strs = {"a"};
        Assert.assertEquals("a", s14.longestCommonPrefix(strs));
    }

}
