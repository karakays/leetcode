package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S207Test {

    S207 s207 = new S207();

    /* 3->2->1->0 */
    @Test
    public void test1() {
        int[][] prerequisites = {{3,2}, {2,1}, {1,0}};
        Assert.assertTrue(s207.canFinish(4, prerequisites));
    }

    @Test
    public void test2() {
        Assert.assertTrue(s207.canFinish(10, new int[][]{}));
    }

    /* 0 <-> 1 */
    @Test
    public void test3() {
        int[][] prerequisites = {{1,0}, {0,1}};
        Assert.assertFalse(s207.canFinish(2, prerequisites));
    }

    /* 3->2->1->0->3 */
    @Test
    public void test4() {
        int[][] prerequisites = {{3,2}, {2,1}, {1,0}, {0,3}};
        Assert.assertFalse(s207.canFinish(4, prerequisites));
    }

}
