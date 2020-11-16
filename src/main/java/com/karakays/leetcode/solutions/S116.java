package com.karakays.leetcode.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class S116 extends Base{
    // Definition for a Node.
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() { }
        public Node(int _val) { val = _val; }
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root != null) {
            queue.add(root);
        }
        int level = 0;
        while (!queue.isEmpty()) {
            int nodesInLevel = queue.size();
            Node previous = null;
            while(nodesInLevel-- > 0) {
                // process parents at level
                Node node = queue.poll();
                log.info("Node {} is at level {}", node.val, level);
                if(previous != null) {
                    previous.next = node;
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
                previous = node;
            }
            level += 1;
            log.info("Next level {} has {} nodes", level, queue.size());
        }
        return root;
    }

}
