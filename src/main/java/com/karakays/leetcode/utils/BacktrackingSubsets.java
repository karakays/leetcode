package com.karakays.leetcode.utils;

import com.karakays.leetcode.solutions.Base;

public class BacktrackingSubsets extends Base {

    boolean finished = false;

    void backtrack(int a[], int k, int n) {
        int[] c = new int[2];           /* candidates for next position */
        int ncandidates = 2;                /* next position candidate count */

        if (is_a_solution(a, k, n))
            process_solution(a, k);
        else {
            k = k + 1;
            construct_candidates(a, k, c, ncandidates);
            for (int i = 0; i < ncandidates; i++) {
                a[k] = c[i];
                // next solution
                make_move(a, k, 0);

                // try if it's a solution
                backtrack(a, k, n);
                if (finished) return;    /* terminate early */

                // solution added, now clean up
                unmake_move(a, k, 0);
            }
        }
    }

    void process_solution(int a[], int k) {
        String s = "[";
        for (int i = 1; i < a.length; i++) {
            s += a[i];
            s += ", ";
        }
        s += "]";
        log.info("{}", s);
    }

    boolean is_a_solution(int a[], int k, int n) {
        return (k == n);
    }

    void make_move(int a[], int k, int n) {
    }

    void unmake_move(int a[], int k, int n) {
    }

    void construct_candidates(int a[], int k, int c[], int ncandidates) {
        c[0] = 1;
        c[1] = 0;
	    ncandidates = 2;
    }

    public static void main(String[] args) {
        BacktrackingSubsets bt = new BacktrackingSubsets();
        int a[] = {-1,-1,-1, -1};

        bt.backtrack(a, 0, 3);
    }
}
