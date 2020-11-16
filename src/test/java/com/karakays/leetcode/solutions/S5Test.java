package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S5Test extends Base {

    S5 s5 = new S5();

    @Test
    public void test1() {
        Assert.assertEquals("bab", s5.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("bb", s5.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("a", s5.longestPalindrome("a"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("a", s5.longestPalindrome("ab"));
    }

    @Test
    public void test5() {
        Assert.assertEquals("abccbaqq", s5.longestPalindrome("abccba"));
    }
}
