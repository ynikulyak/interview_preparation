package com.interview_preparation.basics;

/**
 * You have a long flowerbed in which some of the plots are planted (1), and some are not (0).
 * However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
 * and an integer n, return if n new flowers can be planted in the flowerbed
 * without violating the no-adjacent-flowers rule.
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] array, int flowers) {
        //check parameters, if number of lowers greater than flowerbed size etc.
        if (array.length < flowers || array == null || flowers < 0) {
            return false;
        }

        //number of planted flowers
        int count = 0;

        //to not traverse all the array, stop when all flowers are planted
        for (int i = 0; i < array.length && count < flowers; i++) {
            //if spot is not empty
            if (array[i] == 1) {
                continue;
            }

            //if empty spot at the beginning or empty spot at the end, or at any other positions
            if ((i == 0 || array[i - 1] == 0) && array[i] == 0 && (i == array.length - 1 || array[i + 1] == 0)) {
                count++;
                //plant the flower
                array[i] = 1;
            }
        }
        //check if we were able to plant all flowers
        return count == flowers;
    }
}
