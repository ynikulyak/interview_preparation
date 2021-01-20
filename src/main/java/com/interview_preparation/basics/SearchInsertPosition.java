package com.interview_preparation.basics;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * nums contains distinct values sorted in ascending order.
 */
public class SearchInsertPosition {

    /**
     *
     * @param nums sorted in ascending order array of distinct integers
     * @param target number to find
     * @return an index of target if it exists in nums, or index where to insert it
     */
    public static int searchPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            //to avoid overflow when adding to numbers
            int middle = start + (end - start)/2;
            //found target in nums
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                end = middle -1;
            }else{
                start = middle +1;
            }
        }
        //if target not found in nums, it would be an index to insert
        return start;
    }
}
