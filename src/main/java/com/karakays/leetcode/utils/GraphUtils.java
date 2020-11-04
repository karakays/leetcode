package com.karakays.leetcode.utils;

import com.karakays.leetcode.domain.Graph;
import com.karakays.leetcode.domain.Graph.Edge;
import com.karakays.leetcode.solutions.Base;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class GraphUtils extends Base {

    public static void bfs(Graph g) {
        BFS bfs = new BFS(g);
        for (int i = 1; i < g.nVertices() + 1; i++) {
            if (bfs.states[i] == VertexProperties.State.UNDISCOVERED) {
                bfs.search(g, i);
            }
        }
    }

    public static void dfs(Graph g) {
        DFS dfs = new DFS(g);
        for (int i = 1; i < g.nVertices() + 1; i++) {
            if (dfs.properties[i].state == VertexProperties.State.UNDISCOVERED) {
                dfs.search(g, i);
            }
        }
    }

    public boolean hasCycles(Graph g) {
        BiConsumer<Integer, Integer> cycle = (i, j) -> log.info("Found cycle in {} {}", i, j);
        return false;
    }

    public static void findPath(int x, int y) {

    }

    public static void topSort(Graph g) {
        Stack<Integer> stack = new Stack<>();
        Consumer<Integer> post_process_vertex = (i) -> stack.push(i);
        DFS dfs = new DFS(g, post_process_vertex);
        for (int i = 1; i < g.nVertices() + 1; i++) {
            if (dfs.getVertexProperties()[i].state == VertexProperties.State.UNDISCOVERED) {
                dfs.search(g, i);
            }
        }
    }

    public static void strong_components(Graph g) {

    }

    public static class VertexProperties {
        State state = State.UNDISCOVERED;
        int parent;
        int entryTime;
        int exitTime;

        enum State {
            UNDISCOVERED, DISCOVERED, PROCESSED;
        }

        @Override
        public String toString() {
            return "VertexProperties{" + "state=" + state + ", parent=" + parent +
                    ", entryTime=" + entryTime + ", exitTime=" + exitTime + '}';
        }
    }

    private static class BFS extends Base {
        private final Queue<Integer> queue;
        private final Integer[] parents;
        private final VertexProperties.State[] states;

        public BFS(Graph g) {
            queue = new LinkedList<>();
            parents = new Integer[g.nVertices() + 1];
            states = new VertexProperties.State[g.nVertices() + 1];
            Arrays.fill(states, VertexProperties.State.UNDISCOVERED);
        }

        public void search(Graph graph, int root) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                Integer current = queue.poll();
                Edge edge = graph.edge(current);
                log.info("Visiting vertex {}", current);
                while (edge != null) {
                    int y = edge.y;
                    if ((states[y] != VertexProperties.State.PROCESSED) || graph.isDirected()) {
                        log.info("Processing edge ({}, {})", edge.x, edge.y);
                    }
                    if (states[y] == VertexProperties.State.UNDISCOVERED) {
                        queue.offer(y);
                        states[y] = VertexProperties.State.DISCOVERED;
                        parents[y] = edge.x;
                    }
                    edge = edge.getNext();
                }
                states[current] = VertexProperties.State.PROCESSED;
                log.info("Visit done in vertex {}", current);
            }
        }
    }

    static class DFS extends Base {
        private int time;
        private VertexProperties[] properties;
        private BiConsumer<Integer, Integer> edgeProcessor = (i, j) -> log.info("Tree edge ({0}, {}) being processed", i, j);
        private Consumer<Integer> vertexPreProcessor = (i) -> log.info("Preprocessing vertex={}", i);
        private Consumer<Integer> vertexPostProcessor = (i) -> log.info("Processed vertex={}", i);

        public DFS(Graph g) {
            this.time = 0;
            this.properties = new VertexProperties[g.nVertices() + 1];
            for (int i = 1; i < properties.length; i++) properties[i] = new VertexProperties();
        }

        public DFS(Graph g, BiConsumer<Integer, Integer> edgeProcessor) {
            this(g);
            this.edgeProcessor = edgeProcessor;
        }

        public DFS(Graph g, Consumer<Integer> vertexPostProcessor) {
            this(g);
            this.vertexPostProcessor = vertexPostProcessor;
        }

        public VertexProperties[] getVertexProperties() {
            return this.properties;
        }

        public void search(Graph graph, int root) {
            Edge edge = graph.edge(root);
            properties[root].state = VertexProperties.State.DISCOVERED;
            properties[root].entryTime = ++this.time;
            vertexPreProcessor.accept(root);
            while (edge != null) {
                if (properties[edge.y].state == VertexProperties.State.UNDISCOVERED) {
                    // tree-edge
                    properties[edge.y].parent = edge.x;
                    edgeProcessor.accept(edge.x, edge.y);
                    search(graph, edge.y);
                } else if (properties[edge.y].state != VertexProperties.State.PROCESSED) {
                    // AVOID processing same edge TWICE
                    // back-edge
                    edgeProcessor.accept(edge.x, edge.y);
                }
                // if state=processed, node must have been processed by another path (component).
                edge = edge.getNext();
            }
            properties[root].exitTime = ++this.time;
            properties[root].state = VertexProperties.State.PROCESSED;
            vertexPostProcessor.accept(root);
        }
    }
}
