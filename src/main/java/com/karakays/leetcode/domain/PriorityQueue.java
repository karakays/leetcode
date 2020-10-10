package com.karakays.leetcode.domain;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    private final List<Integer> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public PriorityQueue(Integer... values) {
        queue = new ArrayList<>();
        for(int i : values) {
            offer(i);
        }
    }

    public void clear() {
        queue.clear();
    }

    public void offer(Integer i) {
        queue.add(i);
        bubbleUp(queue.size() - 1);
    }

    public Integer peek() {
        return queue.size() > 0 ? queue.get(0) : null;
    }

    public Integer poll() {
        Integer head = peek();
        if(head == null) {
            return null;
        }
        queue.set(0, queue.get(queue.size() - 1));
        queue.remove(queue.size() - 1);
        bubbleDown(0);
        return head;
    }

    /**
     *
     * @param index
     * @return parent index of element at index
     */
    private int parent(int index) {
        if(index == 0) {
            return -1;
        } else {
            return (index - 1) / 2;
        }
    }

    private int youngestChild(int index) {
        return index * 2 + 1;
    }

    public void bubbleUp(int index) {
        if(parent(index) == -1) {
            return;
        }

        int parentIndex = parent(index);
        if(queue.get(parentIndex) > queue.get(index)) {
            Integer tmp = queue.get(index);
            queue.set(index, queue.get(parentIndex));
            queue.set(parentIndex, tmp);
            bubbleUp(parentIndex);
        }
    }

    /**
     * Heapify
     * @param index
     */
    public void bubbleDown(int index) {
        int min = index;
        int child = youngestChild(index);

        for (int i = 0; i <= 1 && (child + i) < queue.size(); i++) {
            if(queue.get(min) > queue.get(child + i)) {
                min = child + i;
            }
        }

        if(index != min) {
            int tmp = queue.get(index);
            queue.set(index, queue.get(min));
            queue.set(min, tmp);
            bubbleDown(min);
        }
    }

    public List<Integer> traverse() {
        return queue;
    }
}
