package com.com.algorithm;

import java.util.HashMap;
import java.util.Stack;

public class MatchParanthesis {
    public static HashMap<Character, Character> charMap = new HashMap();
    static  {
        charMap.put('}', '{');
        charMap.put(']', '[');
        charMap.put(')', '(');
    }

    public static boolean isValid(String pattern) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        char chars[] = pattern.toCharArray();
        for(char c: chars) {
            if(charMap.containsKey(c) && !stack.isEmpty()) {
                isValid = stack.pop() == charMap.get(c);
            } else {
                stack.push(c);
            }
        }
        return isValid && stack.isEmpty();
    }

    public static boolean match(String pattern) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        char chars[] = pattern.toCharArray();
        for(char c: chars) {
            if(charMap.containsKey(c) && !stack.isEmpty()) {
                if( stack.pop() != charMap.get(c)) {
                    isValid = false;
                };
            } else {
                stack.push(c);
            }

//            Second approach
//            if(charMap.containsKey(c)) { // if closing brace
//                // get top of the stack. Stack cannot be empty
//                char topElement = stack.isEmpty() ? '?' : stack.pop();
//                if (topElement != charMap.get(c)) {
//                    isValid = false;
//                }
//            } else {
//                stack.push(c);
//            }
        }

        return isValid && stack.isEmpty();
    }

    public static void main(String[] args) {
        assert match("{}") ;
        assert match("[{}]()");
        assert match("}") == false;
        assert match("[{}]())") == false;
        assert match("({{{{}}}))") == false;
        System.out.print("good day..");
    }
}
