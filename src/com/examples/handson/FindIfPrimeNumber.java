package com.examples.handson;

public class FindIfPrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(7));
    }

    private static boolean isPrimeNumber(int input) {
        int i = 2;
        while (i <= input/2) {
            if(input % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
