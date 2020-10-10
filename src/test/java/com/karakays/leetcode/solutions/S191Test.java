package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S191Test {

    S191 s191 = new S191();

    @Test
    public void test1() {
        Assert.assertEquals(3, s191.hammingWeight(11));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, s191.hammingWeight(0b00000000000000000000000010000000));
    }

    @Test
    public void test3() {
        Assert.assertEquals(31, s191.hammingWeight(0b11111111111111111111111111111101));
    }

}
