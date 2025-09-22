package com.examples.dsa.stack;

public class Main {
    public static void main(String[] args) {
//        Stack myStack = new Stack(4);
//        System.out.println("Top: " + myStack.getTop().value);
//        System.out.println("Height: " +myStack.getHeight());
//        myStack.printStack();

//        Stack myStack = new Stack(4);
//        myStack.push(10);
//        myStack.printStack();

        Stack myStack = new Stack(4);
        myStack.push(10);
        myStack.push(20);
        myStack.printStack();
        myStack.pop();
        System.out.println("After popping");
        myStack.printStack();
    }
}
