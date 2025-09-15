package com.examples.handson;

public class ReverseNumbers {
    public static void main(String[] args) {
        int reversedNumber = getReversedNumber(12345);
        System.out.println(reversedNumber);
    }

    private static int getReversedNumber(int input) {
        int reversed = 0;
        while (input != 0) {
            int digit = input % 10;
            reversed = reversed * 10 + digit;
            input /= 10;
        }

        return reversed;
    }
}
