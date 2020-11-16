package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S202Test {

    S202 s202 = new S202();

    @Test
    public void test1() {
        Assert.assertTrue(s202.isHappy(19));
    }

    @Test
    public void test2() {
        Assert.assertTrue(s202.isHappy(8));
    }

}
