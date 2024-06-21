package com.company.Array;

public class S14_Maximum_Product_Subarray {
    public static void main(String[] args) {
        long ans = 0;
        long ma = ans;
        long mi = ans;

        int[] arr = new int[]{6, -3, -10, 0, 2};
        int n = arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i] < 0) {
                long temp = mi;
                mi = ma;
                ma = temp;
            }
            ma = Math.max(arr[i], arr[i]*ma);
            mi = Math.min(arr[i], arr[i]*mi);
            ans = Math.max(ans, ma);
        }
        System.out.println(ans);
    }
}
