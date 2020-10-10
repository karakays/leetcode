package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class S20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c;
            switch (c = s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.empty() || '(' != (char) stack.pop()) return false;
                    break;
                case ']':
                    if(stack.empty() || '[' != (char) stack.pop()) return false;
                    break;
                case '}':
                    if(stack.empty() || '{' != (char) stack.pop()) return false;
                    break;
            }
        }
        return stack.empty();
    }

}
