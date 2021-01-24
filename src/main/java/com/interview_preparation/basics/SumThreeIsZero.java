package com.interview_preparation.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * Notice that the solution set must not contain duplicate triplets.
 *
 * This problem follows the Two Pointers pattern.
 * 1. Sort the array and then iterate through it taking one number at a time.
 * 2. For example, we get a number ‘X’, so we need to find ‘Y’ and ‘Z’ such that X + Y + Z == -X+Y+Z==0.
 * At this stage, our problem translates into finding a pair whose sum is equal to “-X”
 * 3. As we need to find all the unique triplets, we have to skip any duplicate number.
 * Since we will be sorting the array, so all the duplicate numbers will be next to each other and are easier to skip.
 *
 * Time complexity: O(n^2)
 * Space complexity: O(n) needed for sorting
 */
public class SumThreeIsZero {

    /**
     *
     * @param array
     * @return list of lists with unique triplets whose sum is 0.
     */
    public static List<List<Integer>> sumThreeElement(int[] array){
        //list to store all unique triplets with sum == 0.
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        //check validity: if array has less than 3 elements, invalid input
        if(array.length < 3){
            return triplets;
        }

        //sort array to get all duplicates together.
        Arrays.sort(array);

        //traverse the array
        for(int i = 0; i < array.length; i++){
            //if the element is not the first element, check if the element is not a duplicate of the previous
            //to get only unique tripelts
            if(i > 0 && array[i] == array[i-1]){
                continue;
            }
            searchPair(array, i+1, -array[i], triplets);
        }
        return triplets;
    }

    /**
     * Find all possible unique pair of elements which sum would be equal to target sum.
     *
     * To find unique pairs, use two pointers approach: start and end.
     *
     * @param array to traverse to find 3 elements which sum is zero
     * @param startIndex index to start the traversing
     * @param targetSum sum to which pair of elements has to be equal
     * @param triplets list of lists to store unique triplets
     */
    private static void searchPair(int[] array, int startIndex, int targetSum, List<List<Integer>> triplets){
        //second pointer
        int endIndex = array.length-1;

        //traverse array till points meet
        while(startIndex < endIndex){
            //sum of pair
            int sum = array[startIndex] + array[endIndex];
            //check sum: if sum is equal to target sum, create a new list and add target sum, elements at the start
            //and end indexes.
            if(sum == targetSum){
                List<Integer> list = new ArrayList<Integer>(3);
                list.add(-targetSum);
                list.add(array[startIndex]);
                list.add(array[endIndex]);
                //add a list to list of list that have all unique triplets
                triplets.add(list);
                //adjust indexes
                startIndex++;
                endIndex--;
                //as we want unique triplets, we skip all duplicates with element at the start index
                while(startIndex < endIndex && array[startIndex] == array[startIndex-1]){
                    startIndex++;
                }
                //as we want unique triplets, we skipp all duplicates with element at the end index
                while(startIndex < endIndex && array[endIndex] == array[endIndex+1]){
                    endIndex--;
                }
            }else if(sum > targetSum){ //as array is sorted, if sum is greater than target sum, reduce end index,
                                      // take smaller element from the end
                endIndex--;
            }else{ //as array is sorted and if sum is less than target sum, increment start index to take bidder
                  // element at the beginning
                startIndex++;
            }
        }
    }
}
