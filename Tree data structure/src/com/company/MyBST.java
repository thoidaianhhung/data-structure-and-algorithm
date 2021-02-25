package com.company;

public class MyBST {

    Node root;

    public MyBST() {
        root = null;
    }

    public void inOrder() {}

    public void preOrder() {}

    public void postOrder() {}

    public void browseTreeByWidth() {}

    public void searchBSTQueue() {}

    public void searchBSTRecursive() {}

    public void deleteNodeBST() {}

    public void insertNodeBST() {}

    public void balanceBST() {}

    public int nodeMinValue(Node p) {
        Node current = p;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int nodeMaxValue(Node p) {
        Node current = p;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
}
