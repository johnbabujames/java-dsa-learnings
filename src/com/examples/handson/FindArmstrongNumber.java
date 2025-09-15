package com.examples.handson;

public class FindArmstrongNumber {
    public static void main(String[] args) {
        int input = 371, start, remainder, result = 0;
        int length = String.valueOf(input).length();
        start = input;
        while (start > 0) {
            remainder = start % 10;
            result = result + (int)Math.pow(remainder, length);
            start = start / 10;
        }

        if(input == result) {
            System.out.println( input + " is an Armstrong Number");
        } else {
            System.out.println( input + " is not an Armstrong Number");
        }
    }
}
