package com.examples.handson;

public class FindSubArrayOfSum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 4, 9, 0, 11 };
        int target = 9;

        for(int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum == target) {
                System.out.println("[" + i + "," + i + "]");
            }
            for(int j = i+1; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
