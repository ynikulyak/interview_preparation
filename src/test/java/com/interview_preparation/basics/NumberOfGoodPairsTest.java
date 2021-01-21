package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfGoodPairsTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{1};
        test3 = new int[]{1,2,3,1,1,3};
        test4 = new int[]{1,1,1,1};
        test5 = new int[]{1,2,3};
    }

    @Test
    public void testNumberOfGoodPairs(){
        assertEquals(0, NumberOfGoodPairs.numberOfPairs(test1));
        assertEquals(0, NumberOfGoodPairs.numberOfPairs(test2));
        assertEquals(0, NumberOfGoodPairs.numberOfPairs(test5));
        assertEquals(4, NumberOfGoodPairs.numberOfPairs(test3));
        assertEquals(6, NumberOfGoodPairs.numberOfPairs(test4));
    }
}
