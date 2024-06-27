package com.company.Array;

public class S22_Product_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] ans = new int[nums.length];

        prefix[0] = 1;
        for(int i=1;i<nums.length;i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        suffix[suffix.length-1] = 1;
        for(int j=suffix.length-2;j>=0;j--) {
            suffix[j] = nums[j+1] * suffix[j+1];
        }

        for(int k=0;k<ans.length;k++) {
            ans[k] = prefix[k]*suffix[k];
            System.out.print(ans[k] + " ");
        }
    }
}
