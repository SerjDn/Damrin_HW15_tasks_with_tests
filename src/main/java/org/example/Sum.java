package org.example;

//https://leetcode.com/problems/two-sum/

public class Sum {

    public int[] twoSum(int[] nums, int target) {
        int[] newNums = new int[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && newNums.length == 0) {
                    newNums = new int[]{i, j};
                }
            }
        }

        return newNums;
    }
}
