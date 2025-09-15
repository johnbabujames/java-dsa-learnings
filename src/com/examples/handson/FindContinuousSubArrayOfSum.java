package com.examples.handson;

import java.util.ArrayList;

/*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.

*/

public class FindContinuousSubArrayOfSum {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 7, 5};
//        int s = 12;
//        int n = 5;

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int s = 15;
        int n = 10;
        System.out.println(subarraySum(arr, n, s));
    }


    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> solution = null;
        for(int i = 0; i < n; i++) {
            solution = new ArrayList<Integer>();
            int total = arr[i];
            solution.add(i);
            if(i == s) {
                return solution;
            }
            for(int j = i+1; j < n; j++) {
                total = total + arr[j];

                if(total == s ){
                    solution.add(j);
                    return solution;
                }
            }
        }
        return solution;
    }
}
