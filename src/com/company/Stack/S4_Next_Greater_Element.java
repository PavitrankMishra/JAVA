package com.company.Stack;

import java.util.*;
public class S4_Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,9,3,1,12,6,8,7};
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[arr.length-1]);
        nge[nge.length - 1] = -1;

        for(int i=arr.length-1;i>=0;i++) {
//            -a+
            while(st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if(st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int e: nge) {
            System.out.print(e + " ");
        }
    }
}
