package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;

import java.util.*;

public class S155 {
    public static class MinStack {
        private final List<Integer> stack = new ArrayList<>();
        private int length;
        private int minimum;

        public MinStack() {
            this.length = 0;
        }

        public void push(int x) {
            if(this.length <= 0 || x < minimum) {
                this.minimum = x;
            }
            stack.add(this.length, x);
            this.length++;
        }

        public void pop() {
            this.length -= 1;
            if(this.length <= 0) {
                this.length = 0;
            } else {
                this.minimum = findMin();
            }
        }

        public int top() {
            if(this.length > 0) {
                return this.stack.get(this.length - 1);
            }
            throw new NoSuchElementException();
        }

        public int getMin() {
            return this.minimum;
        }

        private int findMin() {
            if(this.length > 0) {
                int min = stack.get(0);
                for (int i = 1; i < this.length; i++) {
                    if(stack.get(i) < min) min = stack.get(i);
                }
                return min;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
