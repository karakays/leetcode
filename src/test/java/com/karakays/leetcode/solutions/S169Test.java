package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S169Test {

    S169 s169 = new S169();

    @Test
    public void test1() {
        int[] in = {3,2,3};
        Assert.assertEquals(3, s169.majorityElement(in));
    }

    @Test
    public void test2() {
        int[] in = {6,5,5};
        Assert.assertEquals(5, s169.majorityElement(in));
    }

}
