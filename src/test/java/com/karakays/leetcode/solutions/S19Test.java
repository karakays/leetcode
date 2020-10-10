package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S19Test {

    S19 s19;

    @Before
    public void init() {
        s19 = new S19();
    }

    @Test
    public void test1() {
        Integer[] input = {1,2,3,4,5};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        head = s19.removeNthFromEnd(head, 2);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(Arrays.asList(1,2,3,5), list);
    }

    @Test
    public void test2() {
        Integer[] input = {1,2,3,4,5};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        head = s19.removeNthFromEnd(head, 1);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(Arrays.asList(1,2,3,4), list);
    }

    @Test
    public void test3() {
        Integer[] input = {1};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        head = s19.removeNthFromEnd(head, 1);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(Arrays.asList(), list);
    }

    @Test
    public void test4() {
        Integer[] input = {1,2};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        head = s19.removeNthFromEnd(head, 2);
        List<Integer> list = buildArrayList(head);
        Assert.assertEquals(Arrays.asList(2), list);
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
