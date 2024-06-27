package com.company.Array;

import java.util.HashSet;
import java.util.Set;

public class S23_Contains_Duplicate {
    public static boolean duplicate(int[] ans) {
        Set<Integer> set1 = new HashSet<Integer>();

        for(int i=0;i<ans.length;i++) {
            if(set1.contains(ans[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] ans = new int[] {1,2,3,1};
        System.out.println(duplicate(ans));
    }
}
