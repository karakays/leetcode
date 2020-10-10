package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S141 {
    private final Set<Integer> set = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        while(head != null) {
            if(set.contains(head.hashCode())) {
                return true;
            } else {
                set.add(head.hashCode());
                head = head.next;
            }
        }
        return false;
    }
}
