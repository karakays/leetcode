package com.karakays.leetcode.utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import com.karakays.leetcode.domain.Graph;
import com.karakays.leetcode.domain.Graph.Edge;

public class GraphUtils {

    enum VertexState {
        UNDISCOVERED, DISCOVERED, PROCESSED;
    }

    static class BFS {
        private Queue<Integer> queue = new LinkedList<>();
        private Integer[] parents = new Integer[100];
        private VertexState[] states = new VertexState[100];

        public BFS() {
            for (int i = 0; i < states.length; i++) {
                states[i] = VertexState.UNDISCOVERED;
            }
        }

        public void search(Graph graph, int root) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                Integer current = queue.poll();
                Edge edge = graph.getEdge(current);
                System.out.printf("Visiting vertex %s...%n", current);
                while (edge != null) {
                    int y = edge.getY();
                    if ((states[y] != VertexState.PROCESSED) || graph.isDirected()) {
                        System.out.printf("\tProcessing edge (%s, %s)%n", edge.getX(), edge.getY());
                    }
                    if (states[y] == VertexState.UNDISCOVERED) {
                        queue.offer(y);
                        states[y] = VertexState.DISCOVERED;
                        parents[y] = edge.getX();
                    }
                    edge = edge.getNext();
                }
                states[current] = VertexState.PROCESSED;
                System.out.printf("Visit done in vertex %s...%n", current);
            }
        }
    }

    static class DFS {
        private Integer[] parents = new Integer[100];
        private VertexState[] states = new VertexState[100];

        public DFS() {
            for (int i = 0; i < states.length; i++) {
                states[i] = VertexState.UNDISCOVERED;
            }
        }

        public void search(Graph graph, int root) {
            Edge edge = graph.getEdge(root);
            System.out.printf("Discovered new vertex (%s)%n", root);
            states[root] = VertexState.DISCOVERED;
            System.out.printf("Preprocessing vertex (%s)...%n", root);
            while(edge != null) {
                // tree edge
                if(states[edge.getY()] == VertexState.UNDISCOVERED) {
                    System.out.printf("\tProcessing tree edge (%s, %s)%n", edge.getX(), edge.getY());
                    parents[edge.getY()] = edge.getX();
                    search(graph, edge.getY());
                } else if(states[edge.getY()] != VertexState.PROCESSED) {
                    // back edge
                    System.out.printf("\tProcessing back edge (%s, %s)%n", edge.getX(), edge.getY());
                }
                edge = edge.getNext();
            }
            states[root] = VertexState.PROCESSED;
            System.out.printf("Processed vertex (%s)...%n", root);
        }
    }

    public static void bfs(Graph graph) {
        BFS bfs = new BFS();
        bfs.search(graph, 0);
    }

    public static void dfs(Graph graph) {
        DFS dfs = new DFS();
        dfs.search(graph, 0);

    }
}
