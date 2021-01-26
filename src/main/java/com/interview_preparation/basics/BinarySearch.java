package com.interview_preparation.basics;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value,
 * write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 *
 * Time complexity: O(logn)
 * Space complexity: O(1)
 */
public class BinarySearch {
    /**
     * Find if element exists in array and return its index if exists, or -1 if not exists.
     *
     * @param nums sorted array of integers in ascending order
     * @param target value to find in array
     * @return int index of target value if found or -1 if not found
     */
    public static int findIndex(int[] nums, int target) {
        //check parameters
        if (nums.length < 1 || nums == null) {
            return -1;
        }

        int start = 0;
        int end = nums.length-1;
        int middle = 0;

        //do all operations till pointers meet
        while(start <= end) {
            //as array sorted, find the middle element
            middle = (start + end) / 2;
            //if element at the middle equals target value, we found it - return index middle
            if(nums[middle] == target) {
                return middle;
            }else if (nums[middle] > target) {
                //if element at the middle position greater than target value, check only left half and
                //assign new end
                end = middle -1;
            }else {
                //if element at the middle position less than target value, check only right half and
                //assign new end
                start = middle + 1;
            }
        }
        //if element not found
        return -1;
    }

}
