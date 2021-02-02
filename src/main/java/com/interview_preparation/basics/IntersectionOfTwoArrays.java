package com.interview_preparation.basics;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {

    /**
     * Return intersection of two arrays
     * @param arr1 array of integers
     * @param arr2 array of integers
     * @return array of integers that intersects without duplicates
     */
    public static int[] intersection(int[] arr1, int[] arr2) {
        //check arguments
        if (arr1 == null || arr2 == null || arr1.length < 0 || arr2.length < 0) {
            return new int[]{};
        }

        //set to put all elements of the first array
        Set<Integer> set1 = new HashSet<>(arr1.length);
        for (int i : arr1) {
            set1.add(i);
        }

        //set to put intersect elements of two arrays
        Set<Integer> set2 = new HashSet<>();
        for (int j : arr2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }

        //array to return result of intersection
        int[] result = new int[set2.size()];
        int index = 0;
        for (int k : set2) {
            result[index] = k;
            index++;
        }
        return result;
    }
}
