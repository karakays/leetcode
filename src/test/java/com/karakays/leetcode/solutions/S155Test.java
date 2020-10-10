package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S155Test {

    S155 s155 = new S155();
    S155.MinStack minStack;

    @Before
    public void init() {
        minStack = new S155.MinStack();
    }

    @Test
    public void test1() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }

    @Test
    public void test2() {
        minStack.push(1);
        minStack.push(2);
        Assert.assertEquals(2, minStack.top());
        Assert.assertEquals(1, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(1, minStack.getMin());
        Assert.assertEquals(1, minStack.top());
    }

    @Test
    public void test3() {
        minStack.push(1);
        minStack.pop();
    }

//    ["MinStack","push","push","push","top","pop","getMin","pop","getMin",
//            "pop","push","top","getMin","push","top","getMin","pop","getMin"]
//[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
//    [null,null,null,null,2147483647,null,2147483646,null,2147483646,
//            null,null,2147483647,2147483647,null,-2147483648,-2147483648,null,2147483647]

    @Test
    public void test4() {
        minStack.push( 2147483646);
        minStack.push( 2147483646);
        minStack.push( 2147483647);
        Assert.assertEquals(2147483647, minStack.top());
        minStack.pop();
        Assert.assertEquals(2147483646, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(2147483646, minStack.getMin());

        minStack.pop();
        minStack.push( 2147483647);
        Assert.assertEquals(2147483647, minStack.top());
        Assert.assertEquals(2147483647, minStack.getMin());
        minStack.push(-2147483648);
        Assert.assertEquals(-2147483648, minStack.top());
        Assert.assertEquals(-2147483648, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(2147483647, minStack.getMin());
    }

}
