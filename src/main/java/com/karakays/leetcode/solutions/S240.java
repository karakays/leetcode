package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S19.ListNode;
import com.karakays.leetcode.utils.LinkedListUtils;

import java.util.Stack;

public class S240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1 || matrix[0].length < 1) return false;
        for (int i = 0, j = matrix[0].length - 1; i < matrix.length; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][j]) {
                int low = 0, high = j;
                while(low <= high) {
                    int med = (low + high) / 2;
                    if(target == matrix[i][med]) return true;
                    else if(target > matrix[i][med]) low = med + 1;
                    else high = med - 1;
                }
            }
        }
        return false;
    }

    public boolean _searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1 || matrix[0].length < 1) return false;
        for (int i = 0, initColumn = matrix[0].length - 1; i < matrix.length; i++) {
            for (int j = initColumn; j >= 0; j--) {
                if (target < matrix[i][j]) {
                    // skip current column
                   initColumn -= 1;
                } else if (target > matrix[i][j]) {
                    // skip current row
                    break;
                }
                if(target == matrix[i][j]) return true;
            }
        }
        return false;
    }
}
