package com.company.Array;

import java.util.HashSet;

public class S3_Remove_Duplicates_Array {
    static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int k = 0;
        for(int i=0;i<nums.length;i++) {
            if(set.add(nums[i]) == true) {
                nums[k++] = nums[i];
            }
            set.add(nums[i]);
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
