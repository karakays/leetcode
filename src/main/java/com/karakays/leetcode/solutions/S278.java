package com.karakays.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class S278 {

    private Predicate<Integer> isBadVersion;

    public S278(Predicate<Integer> predicate) {
        this.isBadVersion = predicate;
    }

    public int firstBadVersion(int n) {
        return search(1, n);
    }

    public int search(int i, int j) {
        // avoid overflow
        int med = (j - i) / 2;
        int currVers = i + med;
        int prevVers = i + med - 1;
        boolean isCurrentBad = isBadVersion.test(currVers);

        if(isCurrentBad && (prevVers == 0 || !isBadVersion.test(prevVers))) {
            return currVers;
        }

        if(isCurrentBad) {
            return search(i, currVers - 1);
        } else {
            return search(currVers + 1, j);
        }
    }
}
