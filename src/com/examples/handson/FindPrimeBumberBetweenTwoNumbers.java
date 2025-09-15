package com.examples.handson;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeBumberBetweenTwoNumbers {
    public static void main(String[] args) {

        int start = 20, end = 50;
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if(isPrime(i))  {
                primeNumbers.add(i);
            }
        }

        primeNumbers.forEach(System.out::println);

    }

    private static boolean isPrime(int input) {
        if(input <=2) return false;

        for(int i = 2; i < input/2; i++){
            if(input%i == 0) {
                return false;
            }
        }

        return true;
    }
}
