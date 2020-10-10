package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S8Test {

    S8 s8Test = new S8();

    @Test
    public void test1() {
        Assert.assertEquals(52, s8Test.myAtoi("52"));
    }

    @Test
    public void test12() {
        Assert.assertEquals(10052, s8Test.myAtoi("10052"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(-52, s8Test.myAtoi("-52"));
    }

    @Test
    public void test21() {
        Assert.assertEquals(-42, s8Test.myAtoi("  -42"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(52, s8Test.myAtoi("52 with words"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, s8Test.myAtoi("words and somehintg 123"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(-2147483648, s8Test.myAtoi("-91283472332"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(0, s8Test.myAtoi(""));
    }

    @Test
    public void test7() {
        Assert.assertEquals( 2147483647, s8Test.myAtoi("21474836460"));
    }

    @Test
    public void test8() {
        Assert.assertEquals( 2147483646, s8Test.myAtoi("2147483646"));
    }

    @Test
    public void test9() {
        Assert.assertEquals(-2147483648 , s8Test.myAtoi("-2147483648"));
    }

    @Test
    public void test10() {
        Assert.assertEquals(-2147483648 , s8Test.myAtoi("-2147483649"));
    }
}
