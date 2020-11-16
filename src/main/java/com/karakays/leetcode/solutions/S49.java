package com.karakays.leetcode.solutions;

import java.util.*;

public class S49 extends Base {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String g = new String(c);
            List<String> group = map.get(g);
            if(group == null) {
                group = new LinkedList<>();
                map.put(g, group);
            }
            group.add(s);
        }

        List<List<String>> r = new ArrayList<>();
        for (List<String> list : map.values()) {
            log.info("Group {}", list);
            r.add(list);
        }
        return r;
    }
}
