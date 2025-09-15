package com.examples.handson;

public class FindFactorialValue {
    public static void main(String[] args) {
        System.out.println(getFactorialValue(4));
    }

    private static int getFactorialValue(int input) {
        int factorial = 1;
        for(int i = 1; i <= input; ++i)
        {
            factorial *= i;
        }

        return factorial;
    }
}
