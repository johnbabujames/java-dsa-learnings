package com.examples.handson;

public class ReverseString {
    public static void main(String[] args) {
        String reversedString = reverseString("John");
        System.out.println(reversedString);
    }

    private static String reverseString(String input) {
        char[] letters = input.toCharArray();
        int count = letters.length;
        StringBuffer sb = new StringBuffer();
        for(int i = count-1; i >= 0; i--){
            sb.append(letters[i]);
        }

        return sb.toString();
    }
}
