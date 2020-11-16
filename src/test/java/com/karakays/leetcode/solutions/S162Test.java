package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S162Test {

    S162 s162 = new S162();

    @Test
    public void test1() {
        int[] in = {1,2,3,1};
        Assert.assertEquals(2, s162.findPeakElement(in));
    }

    @Test
    public void test2() {
        int[] in = {1,2,1,3,5,6,4};
        int p = s162.findPeakElement(in);
        Assert.assertTrue(1 == p || 5 ==p);
    }

    @Test
    public void test3() {
        int[] in = {1};
        Assert.assertEquals(0, s162.findPeakElement(in));
    }

    @Test
    public void test4() {
        int[] in = {1,2};
        Assert.assertEquals(1, s162.findPeakElement(in));
    }

}
