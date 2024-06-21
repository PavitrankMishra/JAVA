package com.company.Array;

import java.util.*;
public class S9_Missing_Number {
    static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        int result = -1;
        for(int j = 0;j<=nums.length;j++) {
            if(!set.contains(j)) {
                result = j;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
