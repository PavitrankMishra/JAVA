package com.company.Array;

import java.util.*;
public class S10_Number_Appear_Once {
    static int number_once(int[] nums) {
        HashMap<Integer,Integer> elementMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            if(elementMap.containsKey(nums[i])) {
                elementMap.put(nums[i], elementMap.get(nums[i]) + 1);
            } else {
                elementMap.put(nums[i], 1);
            }
        }

        int result = 0;
        for(Integer key:elementMap.keySet()) {
            if(elementMap.get(key) == 1) {
                result = key;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2,2,1};
        System.out.println("The number that appear once is: " + number_once(nums));
    }
}
