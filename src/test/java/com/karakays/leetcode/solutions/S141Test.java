package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S141Test {

    S141 s141;

    @Before
    public void init() {
        s141 = new S141();
    }

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        Assert.assertTrue(s141.hasCycle(node1));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);

        Assert.assertFalse(s141.hasCycle(node1));
    }
}
