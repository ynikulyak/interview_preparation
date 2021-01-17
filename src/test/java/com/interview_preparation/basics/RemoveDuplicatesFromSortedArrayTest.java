package com.interview_preparation.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jane on 1/14/21.
 */
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates(){

        int[] test1 = {1,2};
        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        int[] test3 = {};
        int[] test4 = {1,1,1,1};
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(test1));
        assertEquals(5, RemoveDuplicatesFromSortedArray.removeDuplicates(test2));
        assertEquals(0, RemoveDuplicatesFromSortedArray.removeDuplicates(test3));
        assertEquals(1, RemoveDuplicatesFromSortedArray.removeDuplicates(test4));
    }
}
