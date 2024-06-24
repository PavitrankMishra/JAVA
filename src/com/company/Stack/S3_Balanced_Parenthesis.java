package com.company.Stack;

import java.util.*;
public class S3_Balanced_Parenthesis {
    public static boolean handleClosing(char ch, Stack<Character> st) {
        if(st.size() == 0) {
            return false;
        } else if(st.peek() != ch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean value = true;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')') {
                value = handleClosing('(', st);
                if(value == false) {
                    System.out.println("False");
                    return;
                }
            } else if(ch == '}') {
                value = handleClosing('{', st);
                if(value == false) {
                    System.out.println("False");
                    return;
                }
            } else if(ch == ']') {
                value = handleClosing('[', st);
                if(value == false) {
                    System.out.println("True");
                    return;
                }
            }
        }
        if(value == true) {
            System.out.println("Valid Parenthesis");
        } else {
            System.out.println("Invalid Parenthesis");
        }
    }
}
