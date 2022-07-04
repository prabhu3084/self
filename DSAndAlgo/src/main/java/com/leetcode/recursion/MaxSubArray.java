package com.leetcode.recursion;

/*
https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSumSoFar = nums[0];
        for (int index = 0; index < nums.length; index++) {
            sum = Math.max(sum + nums[index], nums[index]);
            maxSumSoFar = Math.max(maxSumSoFar, sum);
        }

        return maxSumSoFar;
    }
}
