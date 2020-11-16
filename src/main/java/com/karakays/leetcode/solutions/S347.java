package com.karakays.leetcode.solutions;

import java.util.*;

public class S347 extends Base {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> global = new HashMap<>(k);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, (e1, e2) -> global.get(e1).compareTo(global.get(e2)));

        // O(n)
        for (int i : nums) {
            int f = global.getOrDefault(i, 0);
            f += 1;
            global.put(i, f);
        }

        // O(nlogk)
        for(int key : global.keySet()) {
            pq.offer(key);
            if(pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> top = new ArrayList<>();
        // O(k)
        while(k-- > 0) top.add(pq.poll());

        log.info("{}", top);
        return top.stream().mapToInt(i -> i.intValue()).toArray();
    }

}
