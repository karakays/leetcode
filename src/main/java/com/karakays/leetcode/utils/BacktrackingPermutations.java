package com.karakays.leetcode.utils;

import com.karakays.leetcode.solutions.Base;

import java.util.*;

public class BacktrackingPermutations extends Base {

    public void backtrack(int a[], int k, int n) {
        if(solved(a, k, n)) {
            log.info("Solution found {}", Arrays.toString(a));
        } else {
            k += 1;
            List<Integer> candidates = prepare_candidates(a, k, n);
            for (int i = 0; i < candidates.size(); i++) {
                // make move
                a[k] = candidates.get(i);

                backtrack(a, k, n);

                // unmake move
                // a = new int[5];
            }
        }
    }

    private List<Integer> prepare_candidates(int[] a, int k, int n) {
        Set<Integer> c = new HashSet<>();
        for (int i = 1; i <= n; i++) c.add(i);
        for (int i = 1; i < k; i++) c.remove(a[i]);
        return new ArrayList<>(c);
    }

    private boolean solved(int[] a, int k, int n) {
        return n == k;
    }

    public static void main(String[] args) {
        BacktrackingPermutations p = new BacktrackingPermutations();

        int a[] = new int[5];

        p.backtrack(a, 0, 4);

    }
}
