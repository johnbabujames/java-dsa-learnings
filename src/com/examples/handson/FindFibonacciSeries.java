package com.examples.handson;

import java.util.ArrayList;
import java.util.List;

public class FindFibonacciSeries {
    public static void main(String[] args) {

        getFibonacciSeries(10).forEach(System.out::println);
    }

    private static List<Integer> getFibonacciSeries(int input) {

        int firstTerm = 0, secondTerm = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= input; i++){
            list.add(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return list;
    }
}
