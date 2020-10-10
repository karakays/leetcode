package com.karakays.leetcode.utils;

import com.karakays.leetcode.solutions.S19.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListUtilsTests {
    @Test
    public void test1() {
        Integer[] input =  {3, 9, 20, 8, 9, 15, 7};

        ListNode head = LinkedListUtils.buildLinkedList(input);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(list, Arrays.asList(input));
    }

    @Test
    public void test2() {
        Integer[] input =  {3};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(list, Arrays.asList(input));
    }

    @Test
    public void test3() {
        ListNode head = LinkedListUtils.buildLinkedList(null);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(0, list.size());
    }

    public List<Integer> buildArrayList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

}
