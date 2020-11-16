package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class S347Test {

    S347 s347 = new S347();

    @Test
    public void test1() {
        int[] in = {1,1,1,2,2,3};
        int[] out = s347.topKFrequent(in, 2);
        Arrays.sort(out);
        int[] exp = {1,2};
        Assert.assertArrayEquals(exp, out);
    }

    @Test
    public void test2() {
        int[] in = {1};
        int[] out = {1};
        Assert.assertArrayEquals(out, s347.topKFrequent(in, 1));
    }

    @Test
    public void test3() {
        int[] in = {1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,6,6,6,6};
        int[] exp = {3,4,6};
        int[] out = s347.topKFrequent(in, 3);
        Arrays.sort(out);
        Assert.assertArrayEquals(exp, out);
    }

}
