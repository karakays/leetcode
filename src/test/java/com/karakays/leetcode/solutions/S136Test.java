package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S136Test {

    S136 s136;

    @Before
    public void init() {
        s136 = new S136();
    }

    @Test
    public void test1() {
        int n[] = {2, 2, 1};
        Assert.assertEquals(1, s136.singleNumber(n));
    }

    @Test
    public void test2() {
        int n[] = {4,1,2,1,2};
        Assert.assertEquals(4, s136.singleNumber(n));
    }

    @Test
    public void test3() {
        int n[] = {1};
        Assert.assertEquals(1, s136.singleNumber(n));
    }

}
