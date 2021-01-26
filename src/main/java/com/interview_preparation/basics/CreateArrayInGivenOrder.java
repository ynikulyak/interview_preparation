package com.interview_preparation.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 *
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.
 *
 * Time complexity: O(n^2)
 * Space complexity: O(n) for new array.
 */
public class CreateArrayInGivenOrder {

    /**
     * Return a target array where nums[i] elements are inserted at the position index[i].
     *
     * @param nums array of integers
     * @param index array of integers representing positions of a new array
     * @return array of integers, where nums[i] is inserted at the position index[i].
     */
    public static int[] createTargetArray(int[] nums, int[] index){
        //check validity: if array of different length - invalid
        if(nums.length != index.length){
            return new int[]{};
        }

        //to store elements
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            //shift takes O(n) times if needed
            list.add(index[i], nums[i]);
        }

        //use Stream to convert list to array.
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}
