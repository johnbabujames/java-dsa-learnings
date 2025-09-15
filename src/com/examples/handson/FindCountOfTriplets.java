package com.examples.handson;

import java.util.Arrays;

/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2

 */

public class FindCountOfTriplets {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1, 5, 3, 2};
        System.out.println(countTriplet(arr, n));
    }

    private static int countTriplet(int arr[], int n) {
        int triplets = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++){
            if((arr[i] + arr[i+1]) == arr[i+2]){
                triplets++;
            }
        }

        return triplets;
    }
}
