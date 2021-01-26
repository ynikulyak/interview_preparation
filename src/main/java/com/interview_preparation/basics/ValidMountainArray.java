package com.interview_preparation.basics;

/**
 * Given an array of integers, return true if and only if it is a valid mountain array.
 * Array is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class ValidMountainArray {

    /**
     * Check if array is a mountain array.
     *
     * @param nums array of integers
     * @return true if it's a mountain array, otherwise false
     */
    public static boolean isValidMountainArray(int[] nums) {
        //check parameter
        if (nums.length < 3 || nums == null) {
            return false;
        }

        int currentPosition = 0;
        //traverse array till find duplicate or decreasing element
        for (int i = 0; i < nums.length-1; i++) {
            currentPosition = i;
            //if duplicate was found - is not a mountain array, return false
            if (nums[i] == nums[i+1]) {
                return false;
            }else if (nums[i] > nums[i+1]) {
                break;
            }
        }

        //if greatest element at the beginning or end  - is not a mountain array
        if (currentPosition == 0 || currentPosition == nums.length-1) {
            return false;
        }

        //check the other half of the array
        for (int i = currentPosition; i < nums.length -1; i++){
            //if duplicate or greater element was found - not a mountain array
            if (nums[i] <= nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}
