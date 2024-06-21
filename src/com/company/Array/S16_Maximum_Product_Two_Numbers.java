package com.company.Array;

import java.util.*;
public class S16_Maximum_Product_Two_Numbers {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 3, 6, 7, 0};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]*arr[arr.length-2]);
    }
}
