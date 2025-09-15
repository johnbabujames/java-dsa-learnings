package com.examples.handson;

public class FindSecondHighest {
    public static void main(String[] args) {
        int[] arr1 = {7,5,6,1,4,2,8};
        int secondHighest = Integer.MIN_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > highest) {
                secondHighest = highest;
                highest = arr1[i];
            }else if(arr1[i] > secondHighest && arr1[i] != highest) {
                secondHighest = arr1[i];
            }
        }

        System.out.println(secondHighest);
    }
}
