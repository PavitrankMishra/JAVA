package com.company.Array;

public class S19_Majority_Element {
    static int majority(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        // Boyer-Moore Voting Algorithm to find candidate
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count += (candidate == nums[i]) ? 1 : -1;
        }

        // Verify if the candidate is actually the majority element
        int actualCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                actualCount++;
            }
        }

        if (actualCount > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: " + majority(nums));
    }
}
