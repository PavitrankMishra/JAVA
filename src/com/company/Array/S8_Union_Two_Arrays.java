package com.company.Array;

import java.util.*;
public class S8_Union_Two_Arrays {
    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++) {
            set.add(arr1[i]);
        }

        for(int j=0;j<m;j++) {
            set.add(arr2[j]);
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.addAll(set);

        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {1,2,3,6,7};
        ArrayList<Integer> res = findUnion(arr1, arr2, arr1.length, arr2.length);
        for(int ele:res) {
            System.out.print(ele + " ");
        }
    }
}
