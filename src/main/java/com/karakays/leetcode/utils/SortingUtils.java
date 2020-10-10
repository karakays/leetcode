package com.karakays.leetcode.utils;

import java.util.Arrays;

public class SortingUtils {

    public void mergesort(int[] n, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(n, low, middle);
            mergesort(n, middle + 1, high);
            merge(n, low, middle, high);
        }
    }

    private void merge(int[] n, int low, int medium, int high) {
        int[] left = Arrays.copyOfRange(n, low, medium + 1);
        int[] right = Arrays.copyOfRange(n, medium + 1, high + 1);

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                n[k++] = left[i];
                i++;
            } else {
                n[k++] = right[j];
                j++;
            }
        }

        while (i < left.length) {
            n[k++] = left[i++];
        }

        while (j < right.length) {
            n[k++] = right[j++];
        }
    }

    public void quicksort(int[] n, int low, int high) {
        if (low < high) {
            int pi = partition(n, low, high);
            quicksort(n, low, pi - 1);
            quicksort(n, pi + 1, high);
        }
    }

    private int partition(int[] n, int low, int high) {
        int pivot = high, j = low;
        for (int i = low; i < high; i++) {
            if(n[i] < n[pivot]) {
                swap(n, i, j++);
            }
        }
        swap(n, j, high);
        return j;
    }

    private void swap(int[] n, int i, int j) {
        int tmp = n[j];
        n[j] = n[i];
        n[i] = tmp;
    }
}
