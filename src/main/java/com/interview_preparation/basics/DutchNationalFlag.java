package com.interview_preparation.basics;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that
 * objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 */
public class DutchNationalFlag {

    /**
     * Sort colors in-place
     * @param nums array with n objects colored red, white, or blue
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static void sortColors(int[] nums){
        if(nums.length == 0){
            return;
        }

        //pointer to the current element of the array
        int current = 0;
        //represent zeros at the beginning of the array
        int start = 0;
        //represent twos at the end of the array
        int end = nums.length-1;

        while(current <= end){
            //if current element equals zero, swap it with the element at the position start, that represent
            //right boundary of the zeros
            if(nums[current] == 0){
                int temp = nums[current];
                nums[current] = nums[start];
                nums[start] = temp;
                //move boundary of zeros and the current pointer
                current++;
                start++;
            }else if(nums[current] == 2){ //if the element equals 2, swap it with the element at the end
                int temp = nums[current];
                nums[current] = nums[end];
                nums[end] = temp;
                //adjust end position
                end--;
            }else{ //if element equals 1, just move current pointer forward
                current++;
            }
        }
    }
}
