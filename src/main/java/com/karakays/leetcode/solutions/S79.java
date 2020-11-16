package com.karakays.leetcode.solutions;

import java.util.*;

public class S79 extends Base {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(exist(board, word.toCharArray(), 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, char[] word, int k, int i, int j) {
        if(k == word.length) return true;

        if(i >= board.length || i < 0 || j >= board[i].length || j < 0) return false;

        if(word[k] != board[i][j]) return false;

        char c = board[i][j];
        board[i][j] = '\0';

        boolean exist =  exist(board, word, k + 1, i + 1, j) ||
                exist(board, word, k + 1, i, j + 1) ||
                exist(board, word, k + 1, i - 1, j) ||
                exist(board, word, k + 1, i, j - 1);

        board[i][j] = c;
        return exist;
    }

    public boolean _exist(char[][] board, String word) {
        Deque<int[]> path = new LinkedList<>();
        return backtrack(board, word, 0, path);
    }

    private boolean backtrack(char[][] board, String word, int k, Deque<int[]> path) {
        if(k == word.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            path.stream().forEach(p -> stringBuilder.append( "(" + p[0] + ", " + p[1] + ") -> "));
            log.info("Solution : {}", stringBuilder.toString());
            return true;
        } else {
            k += 1;
            List<int[]> cands = prepareCandidates(board, word, k, path);
            for (int[] p : cands) {
                path.add(p);
                if(backtrack(board, word, k, path)) return true;
                path.removeLast();
            }
            return false;
        }
    }

    private List<int[]> prepareCandidates(char[][] board, String word, int k, Deque<int[]> path) {
        List<int[]> cands = new LinkedList<>();
        char c = word.charAt(k - 1);
        if(k == 1) {
            for (int m = 0; m < board.length; m++) {
                for (int n = 0; n < board[m].length; n++) {
                    if(board[m][n] == c) cands.add(new int[]{m, n});
                }
            }
        } else {
            int[] cell = path.peekLast();
            int i = cell[0], j = cell[1];

            if(j + 1 < board[i].length && !visited(path, i, j + 1) && board[i][j + 1] == c) {
                cands.add(new int[]{i, j + 1});
            }
            if(i + 1 < board.length && !visited(path, i + 1, j) && board[i + 1][j] == c) {
                cands.add(new int[]{i + 1, j});
            }
            if(j - 1 >= 0 && !visited(path, i, j - 1) && board[i][j - 1] == c) {
                cands.add(new int[]{i, j - 1});
            }
            if(i - 1 >= 0 && !visited(path, i - 1, j) && board[i - 1][j] == c) {
                cands.add(new int[]{i - 1, j});
            }
        }
        return cands;
    }

    private boolean visited(Deque<int[]> path, int i, int j) {
        Iterator<int[]> iterator = path.iterator();
        while(iterator.hasNext()) {
            int[] p = iterator.next();
            if(p[0] == i && p[1] == j) return true;
        }
        return false;
    }
}
