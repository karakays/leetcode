package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class S2Test {

    S2 s2 = new S2();

    @Test
    public void test1() {
        S2.ListNode n1 = buildNumber(2, 4, 3);
        S2.ListNode n2 = buildNumber(5, 6, 4);
        S2.ListNode n3 = buildNumber(7, 0, 8);
        S2.ListNode n4 = s2.addTwoNumbers(n1, n2);
        while(n3 != null) {
            Assert.assertEquals(n3.val, n4.val);
            n3 = n3.next;
            n4 = n4.next;
        }
    }

    @Test
    public void test2() {
        S2.ListNode n1 = buildNumber(5, 5, 5);
        S2.ListNode n2 = buildNumber(7);
        S2.ListNode n3 = buildNumber(2, 6, 5);
        S2.ListNode n4 = s2.addTwoNumbers(n1, n2);
        while(n3 != null) {
            Assert.assertEquals(n3.val, n4.val);
            n3 = n3.next;
            n4 = n4.next;
        }
    }

    @Test
    public void test3() {
        S2.ListNode n1 = buildNumber(5, 5, 5);
        S2.ListNode n2 = buildNumber(7, 7, 7);
        S2.ListNode n3 = buildNumber(2, 3, 3, 1);
        S2.ListNode n4 = s2.addTwoNumbers(n1, n2);
        while(n3 != null) {
            Assert.assertEquals(n3.val, n4.val);
            n3 = n3.next;
            n4 = n4.next;
        }
    }

    private S2.ListNode buildNumber(int... digits) {
        S2.ListNode node = new S2.ListNode(digits[0]);
        S2.ListNode start = node;
        for (int i = 1; i < digits.length; i++) {
            node.next = new S2.ListNode(digits[i]);
            node = node.next;
        }
        return start;
    }

}
