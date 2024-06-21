package com.company.Array;

import java.util.*;
public class S13_Number_Of_Occurrence {
    static int occurrence(int[] arr, int x) {
        HashMap<Integer, Integer> elementMap = new HashMap<Integer,Integer>();
        for(int key:arr) {
            if(elementMap.containsKey(key)) {
                elementMap.put(key, elementMap.get(key) + 1);
            } else {
                elementMap.put(key,1);
            }
        }

        return elementMap.get(x);
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2,2,2,3};
        int x = 2;
        System.out.println(occurrence(arr, x));
    }
}
