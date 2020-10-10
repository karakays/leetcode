package com.karakays.leetcode.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class S384 {
    private final int[] original;
    private final Random random = new Random();

    public S384(int[] nums) {
        this.original = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] copy = Arrays.copyOf(original, original.length);
        for (int tmp, j, i = 0; i < original.length; i++) {
            j = random.nextInt(original.length - i) + i;
            tmp = copy[i];
            copy[i] = copy[j];
            copy[j] = tmp;
        }
        return copy;
    }
}
