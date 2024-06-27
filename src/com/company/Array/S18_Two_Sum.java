package com.company.Array;

public class S18_Two_Sum {
    static int[] two_sum(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        int[] res = new int[2];
        while(l<r) {
            int sum = arr[l] + arr[r];
            if(sum == target) {
                res[0] = l;
                res[1] = r;
                return res;
            } else if(sum<target){
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,7,11,15};
        int target = 9;
        int[] ans = two_sum(arr, target);
        for(int e: ans) {
            System.out.print(e +" ");
        }
    }
}
