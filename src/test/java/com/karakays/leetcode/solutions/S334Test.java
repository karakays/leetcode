package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S334Test {

    S334 s334 = new S334();

    @Test
    public void test1() {
        int[] input = {1,2,3,4,5};
        Assert.assertEquals(true, s334.increasingTriplet(input));
    }

    @Test
    public void test2() {
        int[] input = {5,4,3,2,1};
        Assert.assertEquals(false, s334.increasingTriplet(input));
    }


}
