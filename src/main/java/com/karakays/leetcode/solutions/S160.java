package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class S160 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode revA = reverse(null, headA);

        ListNode tempB = headB;
        while(tempB.next != null) {
            tempB = tempB.next;
        }

        ListNode intersect = null;



        reverse(null, headA);
        return intersect;

    }

    private ListNode reverse(ListNode prev, ListNode next) {
        if(next == null) return prev;
        ListNode n = next.next;
        next.next = prev;
        return reverse(next, n);
    }
}
