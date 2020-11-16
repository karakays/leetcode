package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S69Test {

    S69 s69 = new S69();

    @Test
    public void test1() {
        Assert.assertEquals(3, s69.mySqrt(9));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, s69.mySqrt(8));
    }

    @Test
    public void test3() {
        Assert.assertEquals(10, s69.mySqrt(101));
    }

    @Test
    public void test4() {
        Assert.assertEquals(1, s69.mySqrt(1));
    }

    @Test
    public void test5() {
        Assert.assertEquals(1, s69.mySqrt(2));
    }

    @Test
    public void test6() {
        Assert.assertEquals(0, s69.mySqrt(0));
    }

    @Test
    public void test7() {
        Assert.assertEquals(46339, s69.mySqrt(2147395599));
    }

    @Test
    public void test8() {
        Assert.assertEquals(46340, s69.mySqrt(Integer.MAX_VALUE));
    }



}
