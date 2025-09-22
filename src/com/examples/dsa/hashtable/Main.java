package com.examples.dsa.hashtable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        // hashTable.printTable();

        // System.out.println(hashTable.get("tile"));

        // System.out.println(hashTable.keys());

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println(itemInCommon(array1, array2));
    }

    public static boolean itemInCommon(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], true);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.get(arr2[i]) != null) return true;
        }
        return false;
    }
}
