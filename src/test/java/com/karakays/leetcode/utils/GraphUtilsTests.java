package com.karakays.leetcode.utils;

import com.karakays.leetcode.domain.Graph;
import org.junit.Test;

public class GraphUtilsTests {
    @Test
    public void testBfs_undirected() {
        Graph graph = new Graph(5, false);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 4);

        GraphUtils.BFS bfs = new GraphUtils.BFS();
        bfs.search(graph, 1);
    }

    @Test
    public void testDfs_undirected() {
        Graph graph = new Graph(5, false);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 4);

        GraphUtils.DFS dfs = new GraphUtils.DFS();
        dfs.search(graph, 1);
    }

}
