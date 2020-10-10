package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S88Test {

    S88 s88 = new S88();

    @Test
    public void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        s88.merge(nums1, 3, nums2, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

}
