package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S283Test {

    S283 s283 = new S283();

    @Test
    public void test1() {
        s283 = new S283();
        int[] in = {0,1,0,3,12};
        int[] out = {1,3,12,0,0};
        s283.moveZeroes(in);
        Assert.assertArrayEquals(out, in);
    }

    @Test
    public void test2() {
        s283 = new S283();
        int[] in = {0,0,0,3,12,1};
        int[] out = {3,12,1,0,0,0};
        s283.moveZeroes(in);
        Assert.assertArrayEquals(out, in);
    }

    @Test
    public void test3() {
        s283 = new S283();
        int[] in = {3,12,1,0,0,0};
        int[] out = {3,12,1,0,0,0};
        s283.moveZeroes(in);
        Assert.assertArrayEquals(out, in);
    }

}
