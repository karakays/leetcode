package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S79Test {

    S79 s79 = new S79();

    @Test
    public void test1() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        for (int i = 0; i < board.length; i++) System.out.println(String.join("-", new String(board[i])));
        Assert.assertTrue(s79.exist(board, "ABCCED"));
        for (int i = 0; i < board.length; i++) System.out.println(String.join("-", new String(board[i])));
    }

    @Test
    public void test2() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        for (int i = 0; i < board.length; i++) System.out.println(String.join("-", new String(board[i])));
        Assert.assertFalse(s79.exist(board, "ABCB"));
        for (int i = 0; i < board.length; i++) System.out.println(String.join("-", new String(board[i])));
    }

    @Test
    public void test3() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        for (int i = 0; i < board.length; i++) System.out.println(String.join("-", new String(board[i])));
        Assert.assertTrue(s79.exist(board, "SEE"));
        for (int i = 0; i < board.length; i++) System.out.println(String.join("-", new String(board[i])));
    }

}
