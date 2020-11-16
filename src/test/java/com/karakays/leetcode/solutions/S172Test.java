package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S172Test {

    S172 s172 = new S172();

    @Test
    public void test1() {
        Assert.assertEquals(1, s172.trailingZeroes(5));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, s172.trailingZeroes(10));
    }

}
