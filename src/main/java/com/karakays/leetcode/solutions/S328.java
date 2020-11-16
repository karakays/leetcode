package com.karakays.leetcode.solutions;

public class S328 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddTail = traverse(oddHead, evenHead);
        oddTail.next = evenHead;
        return oddHead;
    }

    private ListNode traverse(ListNode odd, ListNode even) {
        if(even == null || even.next == null) {
            return odd;
        }
        odd.next = even.next;
        even.next = odd.next.next;
        return traverse(odd.next, even.next);
    }

}
