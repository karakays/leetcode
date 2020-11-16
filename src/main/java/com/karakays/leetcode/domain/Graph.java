package com.karakays.leetcode.domain;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private final Edge[] outgoingEdges;
    private final boolean directed;
    private int nEdges;
    private int nVertices;

    public Graph(int vCapacity, boolean directed, int[][] edges) {
        this.outgoingEdges = new Edge[vCapacity];
        this.directed = directed;
        Set<Integer> vertices = new HashSet<>();
        for (int[] e : edges) {
            insertEdge(e[0], e[1]);
            vertices.add(e[0]);
            vertices.add(e[1]);
        }
        this.nVertices = vertices.size();
    }

    public Graph(int vCapacity, boolean directed) {
        this(vCapacity, directed, new int[][]{});
    }

    public Edge edge(int id) {
        return outgoingEdges[id];
    }

    public boolean isDirected() {
        return this.directed;
    }

    public int nVertices() {
        return this.nVertices;
    }

    public int nEdges() {
        return this.nEdges;
    }

    public void insertEdge(int x, int y) {
        insertEdge(x, y, this.directed);
    }

    private void insertEdge(int x, int y, boolean directed) {
        Edge head = outgoingEdges[x];
        nEdges++;
        Edge edge = new Edge(x, y, head);
        outgoingEdges[x] = edge;
        if(!directed) {
            insertEdge(y, x, true);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Graph[\n");
        for (int i = 0; i < nVertices; i++) {
            Edge edge = outgoingEdges[i];
            stringBuilder.append("Node=").append(i).append("\n");
            while (edge != null) {
                stringBuilder.append("\t->")
                        .append(edge).append("\n");
                edge = edge.next;
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /**
     * Edge represents a link in the graph.
     * It's modeled with a pair of vertices (x, y)
     */
    public static class Edge {
        public final int x;
        public final int y;
        private int weight;
        private Edge next;

        Edge(int x, int y, Edge next) {
            this.x = x;
            this.y = y;
            this.next = next;
            this.weight = 0;
        }

        public int getWeight() {
            return weight;
        }

        public Edge getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Edge[" + "(" + x + ", " + y + "), weight=" + weight + "]";
        }
    }
}
