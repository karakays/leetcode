package com.karakays.leetcode.solutions;

public class S2 extends Base {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val, carry = 0;
        ListNode prev = new ListNode(sum % 10), next = null;
        ListNode start = prev;
        carry = sum / 10;
        sum = 0;
        l1 = l1.next; l2 = l2.next;

        while(l1 != null || l2 != null) {
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
            sum = 0;
        }

        if(carry > 0) {
            next = new ListNode(carry);
            prev.next = next;
        }

        return start;
    }
}
