package com.interview_preparation.basics;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 */
public class MaximumSubarray {

    /**
     * Find the largest sum of contiguous subarray.
     *
     * @param nums array of nums
     * @return largest sum of contiguous subarray
     */
    public static int maxSum(int[] nums){
        if(nums.length == 0){
            return -1;
        }

        //current sum
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //traverse the array
        for(int i = 0; i < nums.length; i++){
            //current element to the current sum
            int sum = windowSum + nums[i];
            //check if current sum > than current sum + current element
            //and assign current sum to max of both
            windowSum = Math.max(sum, windowSum);
            //assign maxSum to max between current sum and max sum
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
