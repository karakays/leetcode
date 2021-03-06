package com.karakays.leetcode.utils;

import com.karakays.leetcode.domain.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreeUtilsTests {
    @Test
    public void testBuildTree1() {
        Integer[] input =  {3, 9, 20, null, null, 15, 7};

        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);

        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);

        Assert.assertEquals(treeAsList, Arrays.asList(9, 3, 15, 20, 7));
    }

    @Test
    public void testBuildTree2() {
        Integer[] input =  {1, null, 2, null, null, null, 3, null, null, null, null, null, null, null, 4};

        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);

        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);

        Assert.assertEquals(treeAsList, Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void testBuildTreeEmptyInput() {
        Integer[] input =  {};

        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);

        List<Integer> treeAsList = new ArrayList<>();

        Assert.assertNull(root);
    }

    @Test
    public void testBuildTreeNullInput() {
        Integer[] input =  null;

        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);

        List<Integer> treeAsList = new ArrayList<>();

        Assert.assertNull(root);
    }

    @Test
    public void testTraverse1() {
        Integer[] input =  {1, null, 2};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(treeAsList, Arrays.asList(1, 2));
    }

    @Test
    public void testTraverse2() {
        Integer[] input =  {1,  2};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(treeAsList, Arrays.asList(1, 2));
    }

    @Test
    public void testTraverse3() {
        Integer[] input =  {1, 2, 2, 3, 4, 4, 3};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        Assert.assertEquals(Arrays.asList(3, 2, 4, 1, 4, 2, 3), treeAsList);
    }

    @Test
    public void testTraverseOnNull() {
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(null, treeAsList);
        Assert.assertEquals(treeAsList, Collections.emptyList());
    }

    @Test
    public void testTraversePreOrder() {
        Integer[] input =  {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traversePreOrder(root, treeAsList);
        Assert.assertEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7), treeAsList);
    }

    @Test
    public void testTraversePostOrder() {
        Integer[] input =  {1, 2, 2, 3, 4, 4, 3};
        TreeNode root = BinaryTreeUtils.buildTreeFromArray(input);
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traversePostOrder(root, treeAsList);
        Assert.assertEquals(Arrays.asList(3, 4, 2, 4, 3, 2, 1), treeAsList);
    }

    @Test
    public void testInsert1() {
        TreeNode root = BinaryTreeUtils.insert(null, 3);
        Assert.assertEquals(3, root.val);
        Assert.assertNull(root.left);
        Assert.assertNull(root.right);
    }

    @Test
    public void testInsert2() {
        TreeNode root = BinaryTreeUtils.insert(null, 3);
        BinaryTreeUtils.insert(root, 1);
        BinaryTreeUtils.insert(root, 2);
        BinaryTreeUtils.insert(root, 0);
        root = BinaryTreeUtils.insert(root, 7);

        Assert.assertEquals(3, root.val);
        List<Integer> treeAsList = treeAsList(root);
        Assert.assertEquals(Arrays.asList(0,1,2,3,7), treeAsList);
    }

    @Test
    public void testBuildTreeFromList() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3, 4, 5, -1, -20, 7);
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(Arrays.asList(-20, -1, 3, 4, 5, 7), treeAsList(root));
    }

    @Test
    public void testInsertAndReturn() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3, 4, 5, -1, -20, 7);
        TreeNode node = BinaryTreeUtils.insertAndReturn(root, 33);
        Assert.assertEquals(3, root.val);
        Assert.assertEquals(33, node.val);
    }


    @Test
    public void testFindMinimum1() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3, 4, 5, -1, -20, 7);
        Assert.assertEquals(-20, BinaryTreeUtils.minimum(root).val);
    }

    @Test
    public void testFindMinimum2() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3);
        Assert.assertEquals(3, BinaryTreeUtils.minimum(root).val);
    }

    @Test
    public void testFindMinimum3() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(1,2,3,4,5);
        Assert.assertEquals(1, BinaryTreeUtils.minimum(root).val);
    }

    @Test
    public void testSuccessor1() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3, 2, 15, -1, -20, 10, 20, 8, 18, 21, 19);
        TreeNode node15 = root.right;
        Assert.assertEquals(15, node15.val);
        Assert.assertEquals(18, BinaryTreeUtils.successor(root, node15).val);
    }

    @Test
    public void testSuccessor2() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3, 2, 15, -1, -20, 10, 20, 8, 18, 21, 19);
        TreeNode node19 = root.right.right.left.right;
        Assert.assertEquals(19, node19.val);
        Assert.assertEquals(20, BinaryTreeUtils.successor(root, node19).val);
    }

    @Test
    public void testSuccessor3() {
        TreeNode root = BinaryTreeUtils.buildTreeFromList(3, 2, 15, -1, -20, 10, 20, 8, 18, 21, 19);
        TreeNode node21 = root.right.right.right;
        Assert.assertEquals(21, node21.val);
        Assert.assertNull(BinaryTreeUtils.successor(root, node21));
    }

    private List<Integer> treeAsList(TreeNode root) {
        List<Integer> treeAsList = new ArrayList<>();
        BinaryTreeUtils.traverse(root, treeAsList);
        return treeAsList;
    }

}
