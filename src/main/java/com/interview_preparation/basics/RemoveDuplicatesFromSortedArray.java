package com.interview_preparation.basics;

/**
 * Created by jane on 1/14/21.
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Remove duplicates in sorted array in-place such that
     * each element appears only once.
     *
     * @param  nums   sorted array of elements
     * @return        the length of array without duplicates
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
