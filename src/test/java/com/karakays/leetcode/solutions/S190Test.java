package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S190Test {

    S190 s190 = new S190();

    @Test
    public void test1() {
        Assert.assertEquals(964176192, s190.reverseBits(0b00000010100101000001111010011100));
    }

    @Test
    public void test2() {
        Assert.assertEquals(3221225471L, s190.reverseBits(0b11111111111111111111111111111101));
    }

}
