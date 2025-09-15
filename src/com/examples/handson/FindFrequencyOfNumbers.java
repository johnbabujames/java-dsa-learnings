package com.examples.handson;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyOfNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Number:"+entry.getKey() +" Frequencies : "+entry.getValue());
        }
    }
}
