package com.karakays.leetcode.utils;

import com.karakays.leetcode.domain.Graph;
import com.karakays.leetcode.domain.Graph.Edge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GraphUtils {
    private final static Logger log = Logger.getLogger(GraphUtils.class.getName());

    public static void bfs(Graph graph, int start) {
        BFS bfs = new BFS(graph);
        bfs.search(graph, start);
    }

    public static VertexProperties[] dfs(Graph graph, int start) {
        DFS dfs = new DFS(graph);
        return dfs.search(graph, start);
    }

    public boolean hasCycles(Graph g) {
        BiConsumer<Integer, Integer> cycle =
                (i, j) -> {
//                    if()
                    log.log(Level.INFO, "Found cycle in ({0}, {1})", new Object[]{i, j});
                };
        return false;
    }

    public static void findPath(int x, int y) {

    }

    public static void topSort(Graph g) {
        Stack<Integer> stack = new Stack<>();
        Consumer<Integer> post_process_vertex = (i) -> stack.push(i);
        DFS dfs = new DFS(g, post_process_vertex);
        dfs.search(g, 1);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
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

    private static class BFS {
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
                System.out.printf("Visiting vertex %s...%n", current);
                while (edge != null) {
                    int y = edge.y;
                    if ((states[y] != VertexProperties.State.PROCESSED) || graph.isDirected()) {
                        System.out.printf("\tProcessing edge (%s, %s)%n", edge.x, edge.y);
                    }
                    if (states[y] == VertexProperties.State.UNDISCOVERED) {
                        queue.offer(y);
                        states[y] = VertexProperties.State.DISCOVERED;
                        parents[y] = edge.x;
                    }
                    edge = edge.getNext();
                }
                states[current] = VertexProperties.State.PROCESSED;
                System.out.printf("Visit done in vertex %s...%n", current);
            }
        }
    }

    static class DFS {
        private static BiConsumer<Integer, Integer> DEF_EDGE_PRC =
                (i, j) -> log.log(Level.INFO, "Tree edge ({0}, {1}) being processed", new Object[]{i, j});
        private static Consumer<Integer> DEF_PRE_VX_PRC =
                (i) -> log.log(Level.INFO, "Preprocessing vertex={0}", i);
        private static Consumer<Integer> DEF_POST_VX_PRC =
                (i) -> log.log(Level.INFO, "Processed vertex={0}", i);

        private int time;
        private VertexProperties[] properties;
        private BiConsumer<Integer, Integer> edgeProcessor;
        private Consumer<Integer> vertexPreProcessor;
        private Consumer<Integer> vertexPostProcessor;

        public DFS(Graph g, BiConsumer<Integer, Integer> edgeProcessor, Consumer<Integer> vertexPreProcessor,
                   Consumer<Integer> vertexPostProcessor) {
            this.time = 0;
            this.properties = new VertexProperties[g.nVertices() + 1];
            for (int i = 1; i < properties.length; i++) properties[i] = new VertexProperties();
            this.edgeProcessor = edgeProcessor;
            this.vertexPreProcessor = vertexPreProcessor;
            this.vertexPostProcessor = vertexPostProcessor;
        }

        public DFS(Graph g, BiConsumer<Integer, Integer> edgeProcessor) {
            this(g, edgeProcessor, DEF_PRE_VX_PRC, DEF_POST_VX_PRC);
        }

        public DFS(Graph g, Consumer<Integer> vertexPostProcessor) {
            this(g, DEF_EDGE_PRC, DEF_PRE_VX_PRC, vertexPostProcessor);
        }

        public DFS(Graph g) {
            this(g, DEF_EDGE_PRC, DEF_PRE_VX_PRC, DEF_POST_VX_PRC);
        }

        public VertexProperties[] search(Graph graph, int root) {
            Edge edge = graph.edge(root);
            properties[root].state = VertexProperties.State.DISCOVERED;
            properties[root].entryTime = ++this.time;
            vertexPreProcessor.accept(root);
            while(edge != null) {
                if(properties[edge.y].state == VertexProperties.State.UNDISCOVERED) {
                    // tree-edge
                    properties[edge.y].parent = edge.x;
                    edgeProcessor.accept(edge.x, edge.y);
                    search(graph, edge.y);
                } else if(properties[edge.y].state != VertexProperties.State.PROCESSED) {
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
            return properties;
        }
    }
}
