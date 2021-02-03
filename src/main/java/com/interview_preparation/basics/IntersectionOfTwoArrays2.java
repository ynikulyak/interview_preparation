package com.interview_preparation.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 *
 * Follow-up Questions
 *   1. What if the given array is already sorted? How would you optimize your algorithm?
 *
 *      We can use intersectWithSort() method but dropping the sort part. As result we'll get linear
 *      Time complexity O(min(n, m), and Space complexity O(1)

 *   2. What if nums1's size is small compared to nums2's size? Which algorithm is better?
 *
 *      Approach with HashMap is better as we need Space complexity O(n) for the smaller array and Time complexity O(n+m)
 *
 *   3. What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all
 *      elements into the memory at once?
 *
 *      If nums1 fits into the memory, we can use method with hashmap to collect counts for nums1 into a hash map.
 *      Then, we can sequentially load and process nums2.
 *      If neither of the arrays fit into the memory, we can apply some partial processing strategies:
 *      Split the numeric range into subranges that fits into the memory. Modify our method to collect counts only
 *      within a given subrange, and call the method multiple times (for each subrange).
 *
 * OR: Use an external sort for both arrays. Modify method with sort to load and process arrays sequentially.
 */
public class IntersectionOfTwoArrays2 {
    /**
     * Find intersection of two arrays.
     * Time complexity: O(NlogN + MlogM)
     * Space complexity: O(logN + logM) might be O(N+M) depending on sorting
     *
     * @param nums1 array of integers
     * @param nums2 array of integers
     * @return int[] array of common integers appeared as many times as they are shown in both arrays
     */
    public static int[] intersectionUsingSort(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length < 0 || nums2.length < 0) {
            return new int[]{};
        }

        //sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        //index for resulting array
        int index = 0;
        //traverse till rich the end of one of the arrays
        while (i < nums1.length && j < nums2.length) {
            //if elements are equal, put the element to the first array at position index, increment all 3 indexes
            if (nums1[i] == nums2[j]) {
                nums1[index] = nums1[i];
                index++;
                i++; j++;
            }else if (nums1[i] > nums2[j]) {
                j++;
            }else {
                i++;
            }
        }
        //return the copy of the first array from 0 to index where intersect elements stored
        return Arrays.copyOfRange(nums1, 0, index);
    }

    /**
     * Return intersection of arrays with integers as many times as they are appeared in both arrays.
     * Time complexity: O(n+m)
     * Space complexity: O(min(n,m)) as we use hashmap fpr the smallest array
     *
     * @param nums1 array of integers
     * @param nums2 array of integers
     * @return int[] array of integers with appearance of integers as many times as they are appeared in both arrays
     */
    public static int[] intersectionUsingHashMap(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length < 0 || nums2.length < 0) {
            return new int[]{};
        }

        //if the first array is larger, swap arrays as we need to use hashmap for the smallest array
        if (nums1.length > nums2.length) {
            return intersectionUsingHashMap(nums2, nums1);
        }
        //put all the elements from the smallest array into hashmap
        Map<Integer, Integer> map = new HashMap<>(nums1.length);
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        //index for resulting array
        int index = 0;
        //check each integer from the second array
        for (int j : nums2) {
            int value = map.getOrDefault(j, 0);
            if (value > 0) {
                //if value of the key j is greater than 0, put that element as founded in the smallest
                // array at the position "index"
                nums1[index++] = j;
                //reduce the value of value by 1
                map.put(j, value-1);
            }
        }
        //return the copy array with intersect elements from 0 to index
        return Arrays.copyOfRange(nums1, 0, index);
    }
}
