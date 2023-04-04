package com.navya;

import java.util.Stack;

public class BracketValidator {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){}";
        System.out.println(isValid(s)); // true

        s = "(){}[]";
        System.out.println(isValid(s)); // true

        s = "([{}])";
        System.out.println(isValid(s)); // true

        s = "({[}])";
        System.out.println(isValid(s)); // false

        s = "(((()))";
        System.out.println(isValid(s)); // false
    }
}
