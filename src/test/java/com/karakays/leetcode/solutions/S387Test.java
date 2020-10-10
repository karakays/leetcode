package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S387Test {

    S387 s387;

    @Before
    public void init() {
        s387 = new S387();
    }

    @Test
    public void test1() {
        Assert.assertEquals(0, s387.firstUniqChar("leetcode"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, s387.firstUniqChar("loveleetcode"));
    }

}
