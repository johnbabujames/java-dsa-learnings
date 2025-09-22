package com.examples.dsa.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        top = new Node(value);
        height = 1;
    }
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.value + " ");
            current = current.next;
        }
    }

    public Node getTop() {
        return top;
    }
    public int getHeight() {
        return height;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0) return null;
        Node popped = top;
        top = top.next;
        popped.next = null;
        height--;
        return popped;
    }
}
