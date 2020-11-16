package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S33Test {

    S33 s33 = new S33();

    @Test
    public void test1() {
        int[] n = {4, 5, 6, 7, 0, 1, 2};
        Assert.assertEquals(4, s33.search(n, 0));
    }

    @Test
    public void test2() {
        int[] n = {5,1,3};
        Assert.assertEquals(0, s33.search(n, 5));
    }
}
