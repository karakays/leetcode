package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S242Test {

    S242 s242;

    @Before
    public void init() {
        s242 = new S242();
    }

    @Test
    public void test1() {
        Assert.assertEquals(true, s242.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, s242.isAnagram("rat", "car"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, s242.isAnagram("ğıç", "ğıç"));
    }

}
