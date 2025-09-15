package com.examples.handson;

class NumArray {

    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj.sumRange(2, 5));
    }

    private int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return dp[right] - (left == 0? 0 : dp[left - 1]);
    }
}