package com.karakays.leetcode.domain;

import org.junit.Assert;
import org.junit.Test;

public class GraphTest {

    private Graph graph;

    @Test
    public void test_directed() {
        int[][] edges = {{0,1}, {0,3}, {1,2}, {1,3},{1,4}, {2,5}, {3,2}};
        Graph graph = new Graph(15, true, edges);
        Assert.assertEquals(6, graph.nVertices());
    }

    @Test
    public void test_undirected() {
        int[][] edges = {{0,1}, {0,3}, {1,2}, {1,3},{1,4}, {2,5},{3,2}};
        Graph graph = new Graph(15, false, edges);
        Assert.assertEquals(6, graph.nVertices());
    }
}
