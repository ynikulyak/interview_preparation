package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOf1DArrayTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    int[] test6;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{2};
        test3 = new int[]{1,2,3,4};
        test4 = new int[]{1,1,1,1,1};
        test5 = new int[]{3,1,2,10,1};
        test6 = new int[]{-1, 3, -2, 4, 8, -9, 3, -2, -2, -4, 0, 8, -9, 10};
    }

    @Test
    public void testRunningSum(){
        assertArrayEquals(new int[]{}, RunningSumOf1DArray.runningSum(test1));
        assertArrayEquals(new int[]{2}, RunningSumOf1DArray.runningSum(test2));
        assertArrayEquals(new int[]{1, 3, 6, 10}, RunningSumOf1DArray.runningSum(test3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, RunningSumOf1DArray.runningSum(test4));
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, RunningSumOf1DArray.runningSum(test5));
        assertArrayEquals(new int[]{-1, 2, 0, 4, 12, 3, 6, 4, 2, -2, -2, 6, -3, 7}, RunningSumOf1DArray.runningSum(test6));
    }
}
