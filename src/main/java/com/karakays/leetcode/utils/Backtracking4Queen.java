package com.karakays.leetcode.utils;

import com.karakays.leetcode.solutions.Base;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Backtracking4Queen extends Base {

    public void compute(int[][] board, int n, int k) {
        if (solved(k, n)) {
            log.info("Solution:\n{}", dumpBoard(board));
            // move on with next candidate from previous state
        } else {
            k += 1;
            List<Integer> cands = prepareCandidates(board, n , k);

            for(int i : cands) {
                board[k - 1][i] = 1;

                compute(board, n, k);

                // no solutions found, unmove
                board[k - 1][i] = 0;
            }
        }
    }

    public boolean solved(int n, int k) {
        return n == k;
    }

    public List<Integer> prepareCandidates(int[][] board, int n, int k) {
        List<Integer> candidates = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // put queen on [k - 1][i]
            boolean attacked = false;

            for (int j = 0; !attacked && j < n; j++) {
                if (board[j][i] == 1) { attacked = true; break; }
            }

            // horizontal
            for (int j = 0; !attacked && j < n; j++) {
                if (board[k - 1][j] == 1) { attacked = true; break; }
            }

            for (int j = k - 1, m = i; !attacked && j >= 0 && m < n; j--, m++) {
                if (board[j][m] == 1) { attacked = true; break; }
            }

            for (int j = k - 1, m = i; !attacked && j < n && m >= 0; j++, m--) {
                if (board[j][m] == 1) { attacked = true; break;
                }
            }

            for (int j = k - 1, m = i; !attacked && j >= 0 && m >= 0; j--, m--) {
                if (board[j][m] == 1) { attacked = true; break;
                }
            }

            for (int j = k - 1, m = i; !attacked && j < n && m < n; j++, m++) {
                if (board[j][m] == 1) { attacked = true; break; }
            }

            if(!attacked) candidates.add(i);
        }
        return candidates;
    }

    private String dumpBoard(int[][] board) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            String row = String.join(" - ", Arrays.stream(board[i]).mapToObj(j -> String.valueOf(j)).collect(Collectors.toList()));
            stringBuilder.append(row).append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[][] board = new int[4][4];
        Backtracking4Queen b = new Backtracking4Queen();

        b.compute(board, 4, 0);
    }
}
