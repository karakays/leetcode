package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;

import java.util.*;

public class S150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        int op1, op2, result = 0;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 + op1);
                    break;
                case "-":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 - op1);
                    break;
                case "*":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 * op1);
                    break;
                case "/":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 / op1);
                    break;
                default:
                    int i = Integer.parseInt(token);
                    stack.push(i);
            }
        }
        return stack.pop();
    }
}
