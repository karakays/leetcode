package com.karakays.leetcode.solutions;

import org.junit.Test;

import com.karakays.leetcode.solutions.S116.Node;

public class S116Test {

    S116 s116 = new S116();

    @Test
    public void test1() {
        Node node = buildTreeFromList(15, 10, 20, 16, 21, 22);
        
        s116.connect(node);

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

}
