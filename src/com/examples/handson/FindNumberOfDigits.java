package com.examples.handson;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(getNumberOfDigits(1422));
    }

    private static int getNumberOfDigits(int input) {
        int count = 0;
        while (input > 0) {
            count++;
            input/=10;
        }
        return count;
    }
}
