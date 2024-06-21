package com.company.Array;

public class S7_Maximum_Consecutive_Ones {
    static int maximum_ones(int[] nums) {
        int sum = 0;
        int max_Sum = 0;
        int count = 0;
        int max_Count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                sum += nums[i];
                count++;
                if(sum > max_Sum) {
                    max_Sum = sum;
                    max_Count = count;
                }
            } else {
                sum = 0;
                count = 0;
            }
        }
        return max_Count;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,0,1,1,1};
        System.out.println(maximum_ones(nums));
    }
}
