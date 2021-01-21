package com.interview_preparation.basics;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
 * sorted in non-decreasing order.
 *  find an O(n) solution
 */
public class SquaresOfSortedArray {

    /**
     * Return an array of the squares of each number sorted in non-decreasing order
     *
     * @param nums array sorted in non-decreasing order
     * @return new array of squares of each number, sorted in non-decreasing order
     */
    public static int[] squaresOfSortedArray(int[] nums){
        //new array to store result
        int[] array = new int[nums.length];

        //two pointers
        int start = 0;
        int end = nums.length-1;
        //index for the new array
        int size = nums.length-1;

        while(start<=end){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                array[size] = nums[start]*nums[start];
                start++;
            }else{
                array[size] = nums[end]*nums[end];
                end--;
            }
            size--;
        }
        return array;
    }
}
