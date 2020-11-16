package com.karakays.leetcode.solutions;

import java.util.*;

public class S22 extends Base {
        public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
        System.out.println("leaving...");
    }

    public List<String> _generateParenthesis(int n) {
        List<String> s = new LinkedList<>();
        char[] p = new char[n * 2];
        backtrack(s, p, n, 0);
        return s;
    }

    public void backtrack(List<String> s, char[] p, int n, int k) {
        if((n * 2) == k) {
            log.info("{}", Arrays.toString(p));
            s.add(new String(p));
         } else {
            k += 1;
            char[] cand = candidates(p, n, k);
            for (int i = 0; i < cand.length; i++) {
                p[k - 1] = cand[i];
                backtrack(s, p, n, k);
                // either succeeded or failed, unmove in either case due to further combinations
                Arrays.fill(p, k - 1, p.length, '\0');
            }
        }
    }

    public char[] candidates(char[] p, int n, int k) {
        int r = 0, s = 0;
        for (int i = 0; i < p.length; i++) {
            char c = p[i];
            if (c == '(') r++;
            else if(c == ')') s++;
        }
        if(s == r) return new char[]{'('};
        else if(r == n) return new char[]{')'};
        else return new char[]{'(',')'};
    }
}
