package com.company.Stack;

import java.util.*;
public class S2_Duplicate_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                if(st.peek() == '(') {
                    System.out.println(true);
                    System.out.println("Duplicate Brackets");
                    return;
                } else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }
        System.out.println("Correct Brackets");

    }
}
