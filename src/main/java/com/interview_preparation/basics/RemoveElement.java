package com.interview_preparation.basics;

/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed.
 */
public class RemoveElement {

    /**
     * Return the length of new array.
     * Solved with unnecessary copy operation of elements (unnecessary to move elements).
     * @param nums
     * @param val
     * @return the length of new array
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int removeElement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }

        //use two pointers: i - slow, j - fast;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    /**
     * Return the length of new array. Don't unnecessary move elements.
     *
     * @param nums
     * @param val
     * @return the length of a new array, the order of elements doesn't matter.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int removeElementWithoutMovingElementsOneStepLeft(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }

        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] == val){
                //put this element at the end;
                nums[i] = nums[n-1];
                //reduce the length of the array;
                n--;
            }else{
                i++;
            }
        }
        return i;
    }

}
