package com.karakays.leetcode.solutions;

import com.karakays.leetcode.solutions.S104.TreeNode;
import com.karakays.leetcode.utils.BinaryTreeUtils;

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
        queue.add(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while(levelSize-- > 0) {
                Node node = queue.poll();
                log.info("{} is at level {}", node.val, level);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            level += 1;
        }
        return null;
    }

}
