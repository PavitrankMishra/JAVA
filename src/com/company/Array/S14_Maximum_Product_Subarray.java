package com.company.Array;

public class S14_Maximum_Product_Subarray {
    public static void main(String[] args) {
        long ans = 0;
        long ma = ans;
        long mi = ans;

        long[] arr = new long[] {6,-3,-10,0,2};
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < 0) {
                long temp = mi;
                mi = ma;
                ma = temp;
            }

            ma = Math.max(ma*arr[i], arr[i]);
            mi = Math.min(mi*arr[i], arr[i]);
            ans = Math.max(ans, ma);
        }

        System.out.println(ans);
    }
}
