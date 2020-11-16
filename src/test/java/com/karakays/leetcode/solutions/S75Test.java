package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S75Test {

    S75 s75 = new S75();

    @Test
    public void test1() {
        int[] in = {2,0,2,1,1,0};
        int[] out = {0,0,1,1,2,2};
        s75.sortColors(in);
        Assert.assertArrayEquals(out, in);
    }

    @Test
    public void test2() {
        int[] in = {2,0,1};
        int[] out = {0,1,2};
        s75.sortColors(in);
        Assert.assertArrayEquals(out, in);
    }

    @Test
    public void test3() {
        int[] in = {0};
        int[] out = {0};
        s75.sortColors(in);
        Assert.assertArrayEquals(out, in);
    }

}
