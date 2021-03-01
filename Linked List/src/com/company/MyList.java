package com.company;

public class MyList {
    Node head;

    public MyList() {
        head = null;
    }

    public void appendHead(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void appendLast(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
}
