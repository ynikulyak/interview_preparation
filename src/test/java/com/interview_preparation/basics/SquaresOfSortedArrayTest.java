package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfSortedArrayTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{2};
        test3 = new int[]{-7,-3,2,3,11};
        test4 = new int[]{-4,-1,0,3,10};
        test5 = new int[]{-5,-3,-2,-1};
    }

    @Test
    public void testSquaresOfSortedArray(){
        assertArrayEquals(new int[]{4,9,9,49,121}, SquaresOfSortedArray.squaresOfSortedArray(test3));
        assertArrayEquals(new int[]{0,1,9,16,100}, SquaresOfSortedArray.squaresOfSortedArray(test4));
        assertArrayEquals(new int[]{1,4,9,25}, SquaresOfSortedArray.squaresOfSortedArray(test5));
        assertArrayEquals(new int[]{}, SquaresOfSortedArray.squaresOfSortedArray(test1));
        assertArrayEquals(new int[]{4}, SquaresOfSortedArray.squaresOfSortedArray(test2));


    }
}
