package com.examples.handson;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(arr, n));

    }

    private static int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int length = array.length;
        return (array[length-1] - array[0]);
    }
}
