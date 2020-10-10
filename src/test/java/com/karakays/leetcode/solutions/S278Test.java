package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S278Test {

    S278 s278;

    @Test
    public void test1() {
        s278 = new S278(n -> n >= 3);
        Assert.assertEquals(3, s278.firstBadVersion(3));
    }

    @Test
    public void test2() {
        s278 = new S278(n -> n >= 2);
        Assert.assertEquals(2, s278.firstBadVersion(3));
    }

    @Test
    public void test3() {
        s278 = new S278(n -> n >= 4);
        Assert.assertEquals(4, s278.firstBadVersion(5));
    }

    @Test
    public void test4() {
        s278 = new S278(n -> n >= 2);
        Assert.assertEquals(2, s278.firstBadVersion(2));
    }

    @Test
    public void test5() {
        s278 = new S278(n -> n >= 1);
        Assert.assertEquals(1, s278.firstBadVersion(2));
    }

    @Test
    public void test6() {
        s278 = new S278(n -> n >= 1702766719);
        Assert.assertEquals(1702766719, s278.firstBadVersion(2126753390));
    }


}
