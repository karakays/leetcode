package com.karakays.leetcode.utils;

import java.util.Arrays;

public class StringMatcher {

    /**
     *
     * @param s
     * @param t
     * @param i
     * @param j
     * @return lowest edit distance
     */
    public int compare(String s, String t, int i, int j) {
        int[] opt = new int[3];

        if(i == 0) return 0;
        if(j == 0) return 0;

        // match / subst
        opt[0] = compare(s, t, i - 1, j - 1) + s.charAt(i) == t.charAt(j) ? 0 : 1;
        // insert
        opt[1] = compare(s, t, i, j - 1) + 1;
        // delete
        opt[2] = compare(s, t, i - 1, j) + 1;


        int lowest_cost = opt[0];
        for (int k=1; k<=2; k++) {
            if (opt[k] < lowest_cost) lowest_cost = opt[k];
        }

        System.out.printf("i=%s, j=%s, opt[]=%s%n", i, j, Arrays.toString(opt));

        return lowest_cost;
    }

    static class Result {
        int length;
        int curr_ind;
        int prev_ind;

        public Result(int length, int curr_ind, int prev_ind) {
            this.length = length;
            this.curr_ind = curr_ind;
            this.prev_ind = prev_ind;
        }
    }


    public static int longestSequence(int[] n, int i, int j) {
        if(i == 0) {
            return 1;
        }
        if(n[i] >= n[j]) {
            return longestSequence(n, i - 1, j - 1)  + 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] in = {1,2,4,0};

        System.out.println(longestSequence(in, 2, 2));


    }

}
