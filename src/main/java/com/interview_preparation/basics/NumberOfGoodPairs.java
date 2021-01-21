package com.interview_preparation.basics;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
 *
 * Hint:
 * Count how many times each number appears.
 * If a number appears n times, then n * (n – 1) // 2 good pairs can be made with this number
 */
public class NumberOfGoodPairs {

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3};
        int i = numberOfPairs(arr);
        System.out.print(i);
    }

    /**
     * Return the number of good pairs.
     *
     * @param nums array of integers.
     * @return  int number of good pairs.
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * Use combinatorial formula to find number of pairs for a given number:
     * (n*(n-1))/2;
     *
     * Apply this formula for each distinct element of the array.
     */
    public static int numberOfPairs(int[] nums){
        if(nums.length < 2){
            return 0;
        }

        int goodPairs = 0;
        //put all elements in map, where element is a key, the number it appears in array is value.
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //apply combinatorial formula for each value
            int number = (int)((entry.getValue()*(entry.getValue()-1)))/2;
            goodPairs += number;
        }
        return goodPairs;
    }
}
