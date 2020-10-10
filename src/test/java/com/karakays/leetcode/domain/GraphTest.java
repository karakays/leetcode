package com.karakays.leetcode.domain;

import org.junit.Test;

public class GraphTest {

    private Graph graph;

    @Test
    public void test_directed() {
        Graph graph = new Graph(15, true);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(1, 4);
        graph.insertEdge(2, 5);
        graph.insertEdge(3, 2);
        System.out.println(graph);
    }

    @Test
    public void test_undirected() {
        Graph graph = new Graph(15, false);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(1, 4);
        graph.insertEdge(2, 5);
        graph.insertEdge(3, 2);
        System.out.println(graph);
    }
}
