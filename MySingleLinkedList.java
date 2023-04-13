package org.example;

import org.w3c.dom.Node;

public class MySingleLinkedList<T> {
    private class Node {
        T value;
        Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
        }
    }


    // for Shodiyor
    // addFirst
    // removeFirst

    // for Jasur
    // addLast
    // removeLast

    // for Azam
    // addIndex
    // removeIndex

    Node head;
    Node tail;
    int size;

    public void addFirst(T obj) {
        Node node = new Node(obj);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            throw new IllegalArgumentException();
        }
        Node temp = head.next;
        head.next = null;
        head = temp;
        size--;
    }

    public void addLast(T obj) {
        Node node = new Node(obj);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void removeLast() {
        if (head == null) {
            throw new IllegalArgumentException();
        }
        Node temp = head;
        if (temp.next == null) {
            head = null;
        }
        while (temp.next != null) {
            if (temp.next.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

}
