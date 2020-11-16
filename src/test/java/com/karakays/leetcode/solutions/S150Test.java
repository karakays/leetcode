package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class S150Test {

    S150 s150 = new S150();

    @Test
    public void test1() {
        String[] in = {"2", "1", "+", "3", "*"};
        Assert.assertEquals(9, s150.evalRPN(in));
    }

    @Test
    public void test2() {
        String[] in = {"4", "13", "5", "/", "+"};
        Assert.assertEquals(6, s150.evalRPN(in));
    }

    @Test
    public void test3() {
        String[] in = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Assert.assertEquals(22, s150.evalRPN(in));
    }

    @Test
    public void test4() {
        String[] in = {"10"};
        Assert.assertEquals(10, s150.evalRPN(in));
    }

}
