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
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void appendLast(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void printLinkedList() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void sortLinkedList(Node start, Node end) {
        if (start == end) {
            return;
        }
        Node pivot = partitionLast(start, end);
        sortLinkedList(start, pivot);

        if (pivot != null && pivot == start) {
            sortLinkedList(pivot.next, end);
        } else if (pivot != null && pivot.next != null) {
            sortLinkedList(pivot.next.next, end);
        }

    }

    public Node partitionLast(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }
        int pivot = end.data;
        Node pivot_prev = start;
        Node cur = start;

        while (start != end) {
            if (start.data < pivot) {
                pivot_prev = cur;
                int temp = cur.data;
                cur.data = start.data;
                start.data = temp;
                cur = cur.next;
            }
            start = start.next;
        }
        int temp = cur.data;
        cur.data = pivot;
        end.data = temp;

        return pivot_prev;
    }

    public void insertSortLinkedList(Node newNode) {
        Node current;
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;

        }
    }

    public Node newNode(int data) {
        Node x = new Node(data);
        return x;
    }

    public int searchLinkedList(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return current.data;
            }
            current = current.next;
        }
        return 0;
    }

    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void deleteNodePosition(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i <position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
}
