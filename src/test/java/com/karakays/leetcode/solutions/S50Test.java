package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class S50Test {

    S50 s50 = new S50();

    @Test
    public void test1() {
        Assert.assertEquals(1024, s50.myPow(2.0, 10), 0.000001);
    }

    @Test
    public void test2() {
        Assert.assertEquals(9.261, s50.myPow(2.1, 3), 0.000001);
    }

    @Test
    public void test3() {
        Assert.assertEquals(0.25, s50.myPow(2, -2), 0.000001);
    }

    @Test
    public void test4() {
        Assert.assertEquals(1.0, s50.myPow(1, 2147483647), 0.000001);
    }

    @Test
    public void test5() {
        Assert.assertEquals(0.0, s50.myPow(2.0, -2147483648), 0.000001);
    }


}
