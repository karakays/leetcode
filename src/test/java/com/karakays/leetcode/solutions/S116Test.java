package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import com.karakays.leetcode.solutions.S116.Node;

import java.util.LinkedList;
import java.util.Queue;

public class S116Test {

    S116 s116 = new S116();

    @Test
    public void test1() {
    Node node = buildTreeFromArray(new Integer[]{1,2,3,4,5,6,7});
        Node root = s116.connect(node);
        Assert.assertNull(root.next);
        root = root.left;
        Assert.assertNotNull(root);
        Assert.assertEquals(3, root.next.val);
        root = root.left;
        Assert.assertNotNull(root);
        Assert.assertEquals(5, root.next.val);
    }

    @Test
    public void test2() {
        Node node = buildTreeFromArray(new Integer[]{1});
        Node root = s116.connect(node);
        Assert.assertNull(root.next);
        Assert.assertNull(root.left);
        Assert.assertNull(root.right);
        Assert.assertEquals(1, root.val);
    }

    @Test
    public void test3() {
        Node root = s116.connect(null);
        Assert.assertNull(root);
    }

    public static Node buildTreeFromList(int... values) {
        Node root = null;
        for(int val: values) {
            root = insert(root, val);
        }
        return root;
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }

        if(val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static Node buildTreeFromArray(Integer[] values) {
        if(values == null || values.length == 0) {
            return null;
        }

        Node root = new Node(values[0]);
        Queue<Node> tree = new LinkedList<>();
        tree.add(root);

        for (int i = 0; i < (values.length) / 2; i++) {
            if(values[i] != null) {
                Node currentParent = tree.poll();
                if (values[(i * 2) + 1] != null) {
                    Node left = new Node(values[(i * 2) + 1]);
                    currentParent.left = left;
                    tree.add(left);
                }
                if (values[(i * 2) + 2] != null) {
                    Node right = new Node(values[(i * 2) + 2]);
                    currentParent.right = right;
                    tree.add(right);
                }
            }
        }
        return root;
    }

}
