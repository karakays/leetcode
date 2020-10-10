package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S326Test {

    S326 s326 = new S326();

    @Test
    public void test1() {
        Assert.assertEquals(true, s326.isPowerOfThree(27));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, s326.isPowerOfThree(28));
    }

    @Test
    public void test3() {
        Assert.assertEquals(false, s326.isPowerOfThree(26));
    }

    @Test
    public void test4() {
        Assert.assertEquals(false, s326.isPowerOfThree(0));
    }

    @Test
    public void test5() {
        Assert.assertEquals(true, s326.isPowerOfThree(1));
    }

    @Test
    public void test6() {
        Assert.assertEquals(false, s326.isPowerOfThree(2147483647));
    }

    @Test
    public void test7() {
        Assert.assertEquals(false, s326.isPowerOfThree_(2147483647));
    }

}
