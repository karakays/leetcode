package com.karakays.leetcode.utils;

import com.karakays.leetcode.solutions.S19;
import com.karakays.leetcode.solutions.S19.ListNode;

public class LinkedListUtils {
    public static ListNode buildLinkedList(Integer... input) {
        if(input == null || input.length == 0) {
            return null;
        }

        ListNode head = new ListNode(input[0]);
        ListNode node = head;

        for(int j = 1; j < input.length; j++) {
            node.next = new ListNode(input[j]);
            node = node.next;
        }
        return head;
    }

    public static int length(ListNode head) {
        int i = 0;
        while(head != null) {
            head = head.next;
            i++;
        }
        return i;
    }
}
