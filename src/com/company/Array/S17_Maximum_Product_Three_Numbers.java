package com.company.Array;

import java.util.*;
public class S17_Maximum_Product_Three_Numbers {
    static int max_Product(int [] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int max2 = nums[0]*nums[1]*nums[nums.length-1];

        return Math.max(max1, max2);
    }
    public static void main(String[] args) {
        int[] nums = new int[] {-10,-10,2,5};
        System.out.println("The maximum product is:" + max_Product(nums));
    }
}
