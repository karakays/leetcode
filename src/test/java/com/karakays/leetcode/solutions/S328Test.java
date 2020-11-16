package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S328Test {

    S328 s328 = new S328();

    @Test
    public void test1() {
        S328.ListNode head = buildList(1,2,3,4,5);
        head = s328.oddEvenList(head);
        Assert.assertEquals("13524", printList(head));
    }

    @Test
    public void test2() {
        S328.ListNode head = buildList(1,2);
        head = s328.oddEvenList(head);
        Assert.assertEquals("12", printList(head));
    }

    @Test
    public void test3() {
        S328.ListNode head = buildList(1,2,3);
        head = s328.oddEvenList(head);
        Assert.assertEquals("132", printList(head));
    }

    @Test
    public void test4() {
        S328.ListNode head = buildList(1,2,3,4,5,6);
        head = s328.oddEvenList(head);
        Assert.assertEquals("135246", printList(head));
    }

    private String printList(S328.ListNode node) {
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.val);
            node = node.next;
        }
        return stringBuilder.toString();
    }

    private S328.ListNode buildList(int... numbers) {
        S328.ListNode head = new S328.ListNode(numbers[0]);
        S328.ListNode node = head;
        for (int i = 1; i < numbers.length; i++) {
            node.next = new S328.ListNode(numbers[i]);
            node = node.next;
        }
        return head;
    }

}
