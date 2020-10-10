package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S20Test {

    S20 s20 = new S20();

    @Test
    public void test1() {
        String in = "({[]})";
        Assert.assertEquals(true, s20.isValid(in));
    }

    @Test
    public void test2() {
        String in = "()[]{}";
        Assert.assertEquals(true, s20.isValid(in));
    }

    @Test
    public void test3() {
        String in = "(]";
        Assert.assertEquals(false, s20.isValid(in));
    }

    @Test
    public void test4() {
        String in = "]";
        Assert.assertEquals(false, s20.isValid(in));
    }


}
