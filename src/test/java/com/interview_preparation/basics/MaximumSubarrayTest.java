package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

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
        test3 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        test4 = new int[]{-1};
        test5 = new int[]{-2, 1};
        test6 = new int[]{-10000};
    }

    @Test
    public void testMaxSum(){
        assertEquals(-1, MaximumSubarray.maxSum(test1));
        assertEquals(2, MaximumSubarray.maxSum(test2));
        assertEquals(6, MaximumSubarray.maxSum(test3));
        assertEquals(-1, MaximumSubarray.maxSum(test4));
        assertEquals(1, MaximumSubarray.maxSum(test5));
        assertEquals(-10000, MaximumSubarray.maxSum(test6));
    }
}
