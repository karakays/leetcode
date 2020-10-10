package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

public class S133 {
    private final static Logger logger = Logger.getLogger(S133.class.getName());
    // Definition for a Node.
    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        Node[] discovery = new Node[100 + 1];
        discovery[node.val] = new Node(node.val);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            logger.info(String.format("Processing new node %s%n", current.val));
            Node clone = discovery[current.val];
            for(Node n: current.neighbors) {
                if (discovery[n.val] == null) {
                    logger.info(String.format("Discovered new node %s%n", n.val));
                    queue.offer(n);
                    discovery[n.val] = new Node(n.val);
                }
                clone.neighbors.add(discovery[n.val]);
            }
            logger.info(String.format("Processing done with node %s%n", current.val));
        }
        return discovery[node.val];
    }
}
