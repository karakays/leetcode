package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S200Test {

    S200 s200 = new S200();

    @Test
    public void test1() {
        char[][] grid = { {'1','1','1','1','0'}, {'1','1','0','1','0'},
                {'1','1','0','0','0'}, {'0','0','0','0','0'} };
        Assert.assertEquals(1, s200.numIslands(grid));
    }

    @Test
    public void test2() {
        char[][] grid = { {'1','1','0','0','0'}, {'1','1','0','0','0'},
              {'0','0','1','0','0'}, {'0','0','0','1','1'} };
        Assert.assertEquals(3, s200.numIslands(grid));
    }

    /**
     * 1 1 1
     * 0 1 0
     * 1 1 1
     */
    @Test
    public void test3() {
        char[][] grid = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        Assert.assertEquals(1, s200.numIslands(grid));
    }

}
