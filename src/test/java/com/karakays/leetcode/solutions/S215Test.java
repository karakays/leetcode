package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S215Test {

    S215 s215 = new S215();

    @Test
    public void test1() {
        int[] n = {3,2,1,5,6,4};

        Assert.assertEquals(5, s215.findKthLargest(n, 2));
    }

    @Test
    public void test2() {
        int[] n = {3,2,3,1,2,4,5,5,6};
        Assert.assertEquals(4, s215.findKthLargest(n, 4));
    }

}
