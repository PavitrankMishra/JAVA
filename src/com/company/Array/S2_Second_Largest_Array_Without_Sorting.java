package com.company.Array;

public class S2_Second_Largest_Array_Without_Sorting {
    static int second_largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<=arr.length-1;i++) {
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i]>secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }

        if(secondMax==max || secondMax <0) {
            return -1;
        } else {
            return secondMax;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {12,35,1,10,34,1};
        System.out.println(second_largest(arr));
    }
}
