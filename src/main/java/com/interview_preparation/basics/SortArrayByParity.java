package com.interview_preparation.basics;

/**
 * Given an array of non-negative integers, return an array consisting of all the even elements of array,
 * followed by all the odd elements of array.
 *
 * You may return any answer array that satisfies this condition.
 */
public class SortArrayByParity {

    /**
     * Sort array by parity. Return an array consisting of all the even elements of array,
     * followed by all the odd elements of array
     *
     * Approach: sort in-place, using two pointers.
     *
     * @param array of non-negative integers
     * @return sorted array consisting of all the even elements of array, followed by all the odd elements
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int[] sortByParity(int[] array){
        //if array has less than 2 elements, return the array as it is
        if(array.length < 2){
            return array;
        }

        int size = array.length;
        int i = 0;
        while(i < size){
            //if odd element was found
            if(array[i] % 2 != 0){
                //swap odd element with the element at the position size
                int temp = array[i];
                array[i] = array[size-1];
                array[size-1] = temp;
                //reduce size to keep track of position to put odd element next time
                size--;
            }else{ //if odd element was not found
                i++;
            }
        }
        return array;
    }
}
