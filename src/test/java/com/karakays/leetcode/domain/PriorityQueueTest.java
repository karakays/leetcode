package com.karakays.leetcode.domain;

import org.junit.*;

import java.util.Arrays;

public class PriorityQueueTest {
    private PriorityQueue priorityQueue = new PriorityQueue();

    @Before
    public void setup() {
        System.out.println("setting up...");
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(17);
        priorityQueue.offer(12);
        priorityQueue.offer(7);
    }

    @After
    public void teardown() {
        System.out.println("clearing test...");
        priorityQueue.clear();
    }

    @Test
    public void testOffer() {
        Assert.assertEquals(Arrays.asList(5, 7, 17, 12, 10), priorityQueue.traverse());
    }

    @Test
    public void testPoll() {
        int head = priorityQueue.poll();
        Assert.assertEquals(5, head);
        Assert.assertEquals(Arrays.asList(7, 10, 17, 12), priorityQueue.traverse());
    }
}
