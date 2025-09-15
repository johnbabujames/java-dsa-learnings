package com.examples.handson;

/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output: -1
Explanation: Max subarray sum is -1  of element (-1)

 */
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(arr, 5));
    }

    private static long maxSubarraySum(int arr[], int n){

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            curSum += arr[i];
            if(curSum < arr[i]){
                curSum = arr[i];
            }
            if(maxSum < curSum){
                maxSum = curSum;
            }
        }
        return maxSum;

    }
}
