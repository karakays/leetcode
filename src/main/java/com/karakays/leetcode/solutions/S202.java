package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S202 extends Base {
    public boolean isHappy(int n) {
        int fast = compute(compute(n)), slow = compute(n);
        while (fast != slow) {
            log.info("fast={}, slow={}", fast, slow);
            fast = compute(compute(fast));
            slow = compute(slow);
        }
        return fast == 1;
    }

    public int compute(int n) {
        int m = 0;
        int d = -1;
        while (n != 0) {
            d = n % 10;
            m += (d * d);
            n = n / 10;
        }
        return m;
    }

}
