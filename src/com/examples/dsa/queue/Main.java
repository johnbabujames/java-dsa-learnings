package com.examples.dsa.queue;

public class Main {
    public static void main(String[] args) {
//        Queue myQueue = new Queue(7);
//        myQueue.printQueue();
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();

//        Queue myQueue = new Queue(7);
//        myQueue.enqueue(5);
//        myQueue.printQueue();

        Queue myQueue = new Queue(7);
        myQueue.enqueue(5);
        myQueue.enqueue(9);
        myQueue.printQueue();
        myQueue.dequeue();
        System.out.println("After dequeue");
        myQueue.printQueue();
    }
}
