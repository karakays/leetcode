package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;

import java.util.Stack;

public class S234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int len = LinkedListUtils.length(head);

        for(int i = 0; i < len / 2; i++, head = head.next) {
            stack.push(head.val);
        }

        if(len % 2 == 1) {
            head = head.next;
        }

        for(int i = 0; i < len / 2; i++, head = head.next) {
            if(head.val != stack.pop()) {
                return false;
            }
        }

        return true;
    }

}
