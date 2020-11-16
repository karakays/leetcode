package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class S160Test {

    S160 s160 = new S160();

    @Test
    public void test1() {
        S160.ListNode headA = buildList(1,2,3);
        S160.ListNode headB= buildList(4,5);
        S160.ListNode intersect= buildList(10,11);
        headA.next.next.next = intersect;
        headB.next.next = intersect;

        S160.ListNode res = s160.getIntersectionNode(headA, headB);

        while(intersect != null) {
            Assert.assertEquals(intersect, res);
            intersect = intersect.next;
            res = res.next;
        }
    }


    private S160.ListNode buildList(int... numbers) {
        S160.ListNode head = new S160.ListNode(numbers[0]);
        S160.ListNode node = head;
        for (int i = 1; i < numbers.length; i++) {
            node.next = new S160.ListNode(numbers[i]);
            node = node.next;
        }
        return head;
    }


}
