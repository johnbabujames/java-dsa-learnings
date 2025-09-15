package com.examples.dsa.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        System.out.println("Head "+ head.value);
    }

    public void getTail() {
        System.out.println("Tail "+ tail.value);
    }

    public void getLength() {
        System.out.println("Length "+ length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) { // head == null also works here
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast(){
        if (length == 0) { return null; }
        Node temp = head;
        Node current = head;
        while (temp.next != null) {
            current = temp;
            temp = temp.next;
        }
        tail = current;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) { return null; }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (length == 0) { return null; }
        if (index < 0 || index >= length) { return null; }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp == null) { return false; }
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) { return false; }

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) { return null; }
        if (index == 0) {
           return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void removeDuplicates() {
        Node prev = head;
        Node current = head;
        Set<Integer> myset = new HashSet();

        while (current != null) {
            if(myset.add(current.value)){
                prev = current;
                current = current.next;
            } else {
                prev.next = current.next;
                current.next = null;
                current = prev.next;
            }
        }
    }

    public int binaryToDecimal() {
        int decimal = 0;
        Node current = head;

        while(current != null) {
            decimal = decimal * 2 + current.value;
            current = current.next;
        }
        return decimal;
    }

    public void partitionList(int x) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = prev1.next;
            } else {
                prev2.next = current;
                prev2 = prev2.next;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }
    public void reverseBetween(int m, int n) {
        if (m == n) return;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }

        Node start = prev.next;
        Node then = start.next;

        for (int i = m; i < n; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        head = dummy.next;
    }

    public void swapPairs() {
        // Dummy node to simplify swaps at head
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            // Identify nodes to swap
            Node first = prev.next;
            Node second = first.next;

            // Swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev pointer two nodes ahead
            prev = first;
        }
        head = dummy.next;
    }
}

