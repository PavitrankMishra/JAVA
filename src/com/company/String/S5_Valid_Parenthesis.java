package com.company.String;

import java.util.Stack;

public class S5_Valid_Parenthesis {
    public static void main(String[] args) {
        String s = "()[{]{}";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if(ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if(ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else {
                System.out.println("Not a valid parenthesis");
                return;
            }
        }

        System.out.println("Valid Parenthesis");
        return;
    }
}
