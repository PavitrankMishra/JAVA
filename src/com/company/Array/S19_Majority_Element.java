package com.company.Array;

public class S19_Majority_Element {
    static int majority(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for(int i=0;i<nums.length;i++) {
            if(count == 0) {
                count = 1;
                candidate = nums[i];
            }

            count += (candidate == nums[i]) ? 1 : -1;
        }

        int actualCount = 0;
        for(int e:nums) {
            if(e == candidate) {
                actualCount++;
            }
        }

        if(actualCount > nums.length/2) {
            return candidate;
        }else {
            throw new IllegalArgumentException("No, majority element found");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: " + majority(nums));
    }
}
