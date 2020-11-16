package com.karakays.leetcode.solutions;

import com.karakays.leetcode.utils.SortingUtils;

import java.util.*;

public class S56 extends Base {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 1) {
            return intervals;
        }
        Arrays.sort(intervals, (i, j) -> Integer.valueOf(i[0]).compareTo(Integer.valueOf(j[0])));
        Deque<int[]> merged = new LinkedList<>(Arrays.asList(intervals[0]));

        for (int i = 1; i < intervals.length; i++) {
            int[] p = merged.peekLast();
            if (overlaps(p, intervals[i])) {
                merged.pollLast();
                int[] m = {p[0], Math.max(p[1], intervals[i][1])};
                merged.offer(m);
            } else {
                merged.offer(intervals[i]);
            }
        }
        int[][] r = new int[merged.size()][2];
        for (int i = 0; i < r.length; i++) {
            r[i] = merged.poll();
        }
        return r;
    }

    private boolean overlaps(int[] n1, int[] n2) {
        return n1[0] <= n2[0] && n1[1] >= n2[0];
    }


}

