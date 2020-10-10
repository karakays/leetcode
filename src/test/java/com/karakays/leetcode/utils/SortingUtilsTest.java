package com.karakays.leetcode.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingUtilsTest {
    private SortingUtils sortingUtils = new SortingUtils();

    @Test
    public void testMergeSort1() {
        int n[] = {12, 11, 13, 5, 6, 7};
        int answer[] = copyAndSort(n);
        sortingUtils.mergesort(n, 0, n.length - 1);
        Assert.assertArrayEquals(answer, n);
    }

    @Test
    public void testMergeSort2() {
        int n[] = {12, 11, 5, 6, 7};
        int answer[] = copyAndSort(n);
        sortingUtils.mergesort(n, 0, n.length - 1);
        Assert.assertArrayEquals(answer, n);
    }

    @Test
    public void testMergeSort3() {
        int n[] = {12};
        int answer[] = copyAndSort(n);
        sortingUtils.mergesort(n, 0, n.length - 1);
        Assert.assertArrayEquals(answer, n);
    }

    @Test
    public void testQuickSort1() {
        int n[] = {12, 11, 13, 5, 6, 7};
        int answer[] = copyAndSort(n);
        sortingUtils.quicksort(n, 0, n.length - 1);
        Assert.assertArrayEquals(answer, n);
    }

    @Test
    public void testQuickSort2() {
        int n[] = {12, 11, 5, 6, 7};
        int answer[] = copyAndSort(n);
        sortingUtils.quicksort(n, 0, n.length - 1);
        Assert.assertArrayEquals(answer, n);
    }

    @Test
    public void testQuickSort3() {
        int n[] = {12};
        int answer[] = copyAndSort(n);
        sortingUtils.quicksort(n, 0, n.length - 1);
        Assert.assertArrayEquals(answer, n);
    }

    private int[] copyAndSort(int[] n) {
        int copy[] = Arrays.copyOf(n, n.length);
        Arrays.sort(copy);
        return copy;
    }
}
