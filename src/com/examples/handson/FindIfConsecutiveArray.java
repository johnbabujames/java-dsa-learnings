package com.examples.handson;

/*
    Find the min and max of the array
    If the max-min == array.length - 1, then it is a consecutive array
 */
public class FindIfConsecutiveArray {
    public static void main(String[] args) {
        int array[] = {47, 43, 45, 44, 46};
        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }else if(array[i] > max) {
                max = array[i];
            }
        }

        if(max - min == array.length -1){
            System.out.println("It is consecutive");
        } else {
            System.out.println("It is NOT consecutive");
        }


    }
}
