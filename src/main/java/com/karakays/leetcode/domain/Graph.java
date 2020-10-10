package com.karakays.leetcode.domain;

public class Graph {

    private final Edge[] edges;
    private final boolean directed;
    private int nEdges;
    private int nVertices;

    public Graph(int vCapacity, boolean directed) {
        this.edges = new Edge[vCapacity];
        this.directed = directed;
    }

    public Edge getEdge(int id) {
        return edges[id];
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

    public void insertEdge(int x, int y, boolean directed) {
        Edge head = edges[x];
        nEdges++;
        if(head == null) this.nVertices++;
        Edge edge = new Edge(x, y, head);
        edges[x] = edge;
        if(!directed) {
            insertEdge(y, x, true);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Graph[\n");
        for (int i = 0; i < nVertices; i++) {
            Edge edge = edges[i];
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
        private int x;
        private int y;
        private int weight;
        private Edge next;

        Edge(int x, int y, Edge next) {
            this.x = x;
            this.y = y;
            this.next = next;
            this.weight = 0;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
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
