package com.karakays.leetcode.utils;

import com.karakays.leetcode.domain.Graph;
import com.karakays.leetcode.utils.GraphUtils.VertexProperties;
import org.junit.Test;

public class GraphUtilsTests {
    @Test
    public void testBfs_undirected() {
        int[][] edges = {{1,2}, {1,3}, {2, 3}, {2, 4}, {3, 4}};
        Graph graph = new Graph(5, false, edges);
        GraphUtils.bfs(graph, 1);
    }

    @Test
    public void testDfs_undirected() {
        int[][] edges = {{1,2}, {1,3}, {2, 3}, {2, 4}, {3, 4}};
        Graph graph = new Graph(5, false, edges);
        VertexProperties[] properties = GraphUtils.dfs(graph, 1);
        for (int i = 0; i < properties.length; i++) {
            System.out.printf("node=[%s], %s%n", i, properties[i]);
        }
    }

    @Test
    public void test_topsort() {
        int[][] edges = {{1,2}, {2,3}, {3, 4}, {4, 5}};
        Graph graph = new Graph(6, true, edges);

        GraphUtils.topSort(graph);
    }

}
