package com.examples.dsa.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    public Queue(int value ) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void getFirst() {
        System.out.println("First: "+ first.value);
    }

    public void getLast() {
        System.out.println("Last: "+ last.value);
    }

    public void getLength() {
        System.out.println("Length: "+ length);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) return null;
        Node current = first;
        if (length == 1) {
            first = null;
            last = null;
        }else {
            first = first.next;
            current.next = null;
        }
        length--;
        return current;
    }
}
