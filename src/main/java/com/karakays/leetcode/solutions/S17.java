package com.karakays.leetcode.solutions;

import java.util.*;

public class S17 {
    private final Map<String, char[]> map = new HashMap<>();

    {
        map.put("2", "abc".toCharArray());
        map.put("3", "def".toCharArray());
        map.put("4", "ghi".toCharArray());
        map.put("5", "jkl".toCharArray());
        map.put("6", "mno".toCharArray());
        map.put("7", "pqrs".toCharArray());
        map.put("8", "tuv".toCharArray());
        map.put("9", "wxyz".toCharArray());
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() < 1) return Collections.EMPTY_LIST;
        List<String> letters = new LinkedList<>();
        int k = digits.length();
        char[] word = new char[digits.length()];
        compute(letters, digits, word, 0);
        return letters;
    }

    public void compute(List<String> letters, String digits, char[] word, int k) {
        if(k == digits.length()) {
            letters.add(new String(word));
        } else {
            String digit = digits.substring(k, k + 1);
            k += 1;
            char[] candidates = prepareCandidates(digit);
            for (int i = 0; i < candidates.length; i++) {
                word[k - 1] = candidates[i];
                compute(letters, digits, word, k);
            }
        }
    }

    private char[] prepareCandidates(String digit) {
        return map.get(digit);
    }
}
