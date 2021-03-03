package com.company;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Node> t;

    public MyQueue() {
        t = new LinkedList<>();
    }
    public boolean isEmpty() {
        return t.isEmpty();
    }
    public void enqueue(Node x) {
        t.add(x);
    }

    public Node dequeue() {
        return t.poll();
    }
}
