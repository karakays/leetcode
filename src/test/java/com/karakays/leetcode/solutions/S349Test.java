package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class S349Test {

    S349 s349 = new S349();

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = {2, 2};
        Assert.assertArrayEquals(result, s349.intersect(nums1, nums2));
    }

    @Test
    public void test2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expected = {4, 9};
        int[] actual = s349.intersect(nums1, nums2);
        Arrays.sort(actual);;
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] nums1 = {1, 1, 2, 2};
        int[] nums2 = {2, 2};
        int[] result = {2, 2};
        Assert.assertArrayEquals(result, s349.intersect_sorted(nums1, nums2));
    }

    @Test
    public void test4() {
        int[] nums1 = {4, 5, 9};
        int[] nums2 = {4, 4, 8, 9, 9};
        int[] expected = {4, 9};
        int[] actual = s349.intersect_sorted(nums1, nums2);
        Assert.assertArrayEquals(expected, actual);
    }

}
