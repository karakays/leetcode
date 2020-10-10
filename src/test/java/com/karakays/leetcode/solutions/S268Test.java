package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S268Test {

    S268 s268 = new S268();

    @Test
    public void test0() {
        int[] in = {9,6,4,2,3,5,7,0,1};
        Assert.assertEquals(8, s268.missingNumber(in));
    }

    @Test
    public void test1() {
        int[] in = {0,1};
        Assert.assertEquals(2, s268.missingNumber(in));
    }

    @Test
    public void test2() {
        int[] in = {0};
        Assert.assertEquals(1, s268.missingNumber(in));
    }

}
