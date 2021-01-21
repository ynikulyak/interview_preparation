package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayByParityTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{2};
        test3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        test4 = new int[]{3,1,2,4};
    }

    @Test
    public void testSortArrayByParity(){
        assertArrayEquals(new int[]{}, SortArrayByParity.sortByParity(test1));
        assertArrayEquals(new int[]{2}, SortArrayByParity.sortByParity(test2));
        assertArrayEquals(new int[]{8,2,6, 4, 5, 7,3,9,1}, SortArrayByParity.sortByParity(test3));
        assertArrayEquals(new int[]{4,2, 1, 3}, SortArrayByParity.sortByParity(test4));
    }
}
