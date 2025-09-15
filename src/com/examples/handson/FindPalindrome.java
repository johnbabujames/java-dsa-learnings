package com.examples.handson;

public class FindPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcddcba"));
    }

    private static boolean isPalindrome(String input) {

        char[] inputArr = input.toCharArray();
        int length = inputArr.length;

        for(int i = 0, j = length-1; i <=length/2; i++, j--){
            if(inputArr[i] != inputArr[j]) {
                return false;
            }
        }

        return true;
    }
}
