package com.interview_preparation.basics;

/**
 * Given an array, write a function to move all 0's to the end of it while maintaining the relative order of
 * the non-zero elements.
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    /**
     * Move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Therefore,
     * @param nums array of numbers
     * @return array with all zero's at the end
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int[] moveZeroes(int[] nums){
        if(nums.length < 2){
            return nums;
        }

        for(int i = 0, j = 0; j < nums.length; j++){
            //when we find a non-zero element, we need to swap elements pointed by current (j) and slow (i) pointer
            if(nums[j]  != 0){
                if(nums[i] == 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }
        }
        return nums;
    }
}
