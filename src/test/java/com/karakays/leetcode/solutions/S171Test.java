package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S171Test {

    S171 s171 = new S171();

    @Test
    public void test1() {
        Assert.assertEquals(701, s171.titleToNumber("ZY"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1381, s171.titleToNumber("BAC"));
    }

}
