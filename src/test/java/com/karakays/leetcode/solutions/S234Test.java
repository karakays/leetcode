package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class S234Test {

    S234 s234;

    @Before
    public void init() {
        s234 = new S234();
    }

    @Test
    public void test1() {
        Integer[] input = {1,2,0,2,1};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        Assert.assertTrue(s234.isPalindrome(head));
    }

    @Test
    public void test2() {
        Integer[] input = {1,2,3,3,2,1};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        Assert.assertTrue(s234.isPalindrome(head));
    }

    @Test
    public void test3() {
        Integer[] input = {1};
        ListNode head = LinkedListUtils.buildLinkedList(input);
        Assert.assertTrue(s234.isPalindrome(head));
    }

}
