package com.interview_preparation.basics;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums
 */
public class RunningSumOf1DArray {

    /**
     * Return the running sum of nums
     * @param nums array of numbers
     * @return array of running sum of nums
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int[] runningSum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = sum + nums[i];
            sum = nums[i];
        }
        return nums;
    }
}
