package com.examples.handson;

import java.util.HashMap;
import java.util.Stack;

public class FindValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{()[]}"));
    }
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<Character>();
        for (Character c : charArray) {
            if (map.keySet().contains(c)) {
                stack.push(c);
            } else if (map.values().contains(c)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
