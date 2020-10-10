package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S125Test {

    S125 s125;

    @Before
    public void init() {
        s125 = new S125();
    }

    @Test
    public void test1() {
        Assert.assertEquals(true, s125.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, s125.isPalindrome("race a car"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, s125.isPalindrome(""));
    }



}
