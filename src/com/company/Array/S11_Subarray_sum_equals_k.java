package com.company.Array;

import java.util.HashMap;

public class S11_Subarray_sum_equals_k {
    static int required_sum(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        map.put(0, 1);

        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
        int k = 5;
    }
}
