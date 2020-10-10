package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if((i % 15) == 0) {
                list.add("FizzBuzz");
            } else if((i % 5) == 0) {
                list.add("Buzz");
            } else if((i % 3) == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
