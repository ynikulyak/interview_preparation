package com.interview_preparation.basics;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Time complexity: O(n^2)
 * Space complexity: O(n). To achieve O(1) you can use selection sort instead of build in sort function.
 * Time complexity still would be O(n^2), although algorithm would be a little slower.
 */
public class ThreeSumClosest {

    /**
     * Return the sum of the three integers whose sum is closest to the target.
     *
     * @param nums array of integers
     * @param target sum to approach to
     * @return int - closest sum to the target
     */
    public static int closestSum(int[] nums, int target) {
        //check parameters.
        if (nums.length < 1 || nums == null) {
            return 0;
        }

        //first of all we have to sort the array, to not check duplicates as they would have the same result
        Arrays.sort(nums);

        //closest sum to return
        int closest = Integer.MAX_VALUE;
        //min difference with target
        int diff = Integer.MAX_VALUE;

        //
        for (int i = 0; i < nums.length; i++) {
            //use two-pointers approach
            int first = i + 1;
            int last = nums.length - 1;

            //traverse while first < last
            while (first < last) {
                //find sum of three elements
                int sum = nums[i] + nums[first] + nums[last];
                //if sum == target => diff == 0 => we found the closest and can stop the loop
                if (sum == target) {
                    return sum;
                } else if (sum > target) { //if sum is greater than target, check the difference
                    //if difference greater, reassign difference to the new one and reassign closest sum
                    if (sum - target < diff) {
                        diff = sum - target;
                        closest = sum;
                    }
                    //as sum is greater than target and our array is sorted, reduce last by one.
                    last--;
                } else { //if sum is less than target, check difference
                    //if difference is greater, reassign difference and the closest sum
                    if (target - sum < diff) {
                        diff = target - sum;
                        closest = sum;
                    }
                    //as array is sorted and sum is less than target, increment the first.
                    first++;
                }
            }
        }
        return closest;
    }
}
