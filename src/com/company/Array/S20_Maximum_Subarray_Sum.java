package com.company.Array;

public class S20_Maximum_Subarray_Sum {
    static int subarray_sum(int[] arr) {
        int sum = 0;
        int max_Sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            if(sum > max_Sum) {
                max_Sum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max_Sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int res = subarray_sum(arr);
        System.out.println("The masximum subarray sum is: " + res);
    }
}
