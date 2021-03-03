package com.company;

public class MyBST {

    Node root;

    public MyBST() {
        root = null;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void browseTreeByWidth(Node root) {
        if (root == null) {
            return;
        }
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(root);
        while (!myQueue.isEmpty()) {
            Node temp = myQueue.dequeue();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                myQueue.enqueue(temp.left);
            }
            if (temp.right != null) {
                myQueue.enqueue(temp.right);
            }
        }
    }

    public void searchBSTQueue(Node root, int key) {
        if (root == null) {
            return;
        }
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(root);

        while (!myQueue.isEmpty()) {
            Node temp = myQueue.dequeue();
            if (key == temp.data) {
                System.out.println("Result: " + temp.data);
            }
            if (temp.left != null) {
                myQueue.enqueue(temp.left);
            }
            if (temp.right != null) {
                myQueue.enqueue(temp.right);
            }
        }
    }

    public Node searchBSTRecursive(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return searchBSTRecursive(root.left, key);
        }
        return searchBSTRecursive(root.right, key);
    }

    public void deleteNodeBST() {}

    public void insertNodeBST(int key) {
        root = insertRecursive(root, key);
    }

    public Node insertRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.data) {
            root.right = insertRecursive(root.right, key);
        }
        return root;
    }

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
