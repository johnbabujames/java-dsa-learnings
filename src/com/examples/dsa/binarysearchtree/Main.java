package com.examples.dsa.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(47);
//        bst.insert(21);
//        bst.insert(76);
//        bst.insert(18);
//        bst.insert(27);
//        bst.insert(52);
//        bst.insert(82);



//        System.out.println(bst.getRoot().left.right.value);

//        System.out.println(bst.contains(27));
//        System.out.println(bst.contains(17));

//        System.out.println("BST Contains 27: " + bst.rContains(27));
//        System.out.println("BST Contains 17: " + bst.rContains(17));

//        bst.rInsert(20);
//        bst.rInsert(10);
//        bst.rInsert(30);
//
//        System.out.println("Root is: " + bst.getRoot().value);
//        System.out.println("Root->Left: "+ bst.getRoot().left.value);
//        System.out.println("Root->Right: "+ bst.getRoot().right.value);

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);
        System.out.println(bst.minValue(bst.getRoot()));
        System.out.println(bst.minValue(bst.getRoot().right));
    }
}
