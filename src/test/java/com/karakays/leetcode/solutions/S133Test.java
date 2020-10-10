package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import com.karakays.leetcode.solutions.S133.Node;

import java.util.*;

public class S133Test {

    S133 s133 = new S133();

    @Test
    public void test1() {
        // [[2,4],[1,3],[2,4],[1,3]]
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Assert.assertEquals(bfs(node1), bfs(s133.cloneGraph(node1)));
    }

    @Test
    public void test2() {
        Node node1 = new Node(1);
        Assert.assertEquals(bfs(node1), bfs(s133.cloneGraph(node1)));
    }

    @Test
    public void test3() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        Assert.assertEquals(bfs(node1), bfs(s133.cloneGraph(node1)));
    }

    private List<List<Integer>> bfs(Node root) {
        ArrayList<Integer>[] traversal = new ArrayList[100+1];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean[] discovery = new boolean[100];
        discovery[root.val] = true;
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            for(Node n: current.neighbors) {
                if (!discovery[n.val]) {
                    queue.offer(n);
                    discovery[n.val] = true;
                }
                if(traversal[current.val] == null) traversal[current.val] = new ArrayList<>();
                traversal[current.val].add(n.val);
            }
        }
        return Arrays.asList(traversal);
    }

}
