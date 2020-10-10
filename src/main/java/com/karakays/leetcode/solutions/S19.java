package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S19 {
      public static class ListNode {
          public int val;
          public ListNode next;
          public ListNode() {}
          public ListNode(int val) { this.val = val; }
          public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        int len = 0;
        while(head != null) {
            list.add(head);
            head = head.next; len++;
        }

        int prev = (len - n - 1);
        int next = prev + 2;
        ListNode nextNode = next < list.size() ? list.get(next) : null;
        if(prev < 0) {
            return nextNode;
        } else {
            list.get(prev).next = nextNode;
            return list.get(0);
        }
    }

}
