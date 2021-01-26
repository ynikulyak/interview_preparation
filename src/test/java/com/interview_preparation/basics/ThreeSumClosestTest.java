package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumClosestTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{-1,2,1,-4};
        test2 = new int[]{1, 1, 1, 0};
        test3 = new int[]{1,1,-1,-1,3};
        test4 = new int[]{};
    }

    @Test
    public void testClosestSum(){
        assertEquals(2, ThreeSumClosest.closestSum(test1, 1));
        assertEquals(2, ThreeSumClosest.closestSum(test2, -100));
        assertEquals( -1, ThreeSumClosest.closestSum(test3, -1));
        assertEquals(0, ThreeSumClosest.closestSum(test4, -2));
    }
}
