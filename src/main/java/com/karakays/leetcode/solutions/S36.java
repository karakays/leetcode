package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S36 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c == '.') {
                    continue;
                } else if(!(Character.isDigit(c) && set.add(Character.valueOf(c)))) {
                    System.out.printf("Not valid c=%s, i=%s, j=%s", c, i, j);
                    return false;
                }
            }
            set.clear();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if(c == '.') {
                    continue;
                } else if(!(Character.isDigit(c) && set.add(Character.valueOf(c)))) {
                    System.out.printf("Not valid c=%s, i=%s, j=%s", c, i, j);
                    return false;
                }
            }
            set.clear();
        }
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char c = board[l][k];
                        if(c == '.') {
                            continue;
                        } else if(!(Character.isDigit(c) && set.add(Character.valueOf(c)))) {
                            System.out.printf("Not valid c=%s, l=%s, k=%s", c, l, k);
                            return false;
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}
