package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    int[] test6;
    int[] test7;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{1, 1};
        test3 = new int[]{1, 0};
        test4 = new int[]{0, 1, 0};
        test5 = new int[]{1,0,0,0,1};
        test6 = new int[]{0,1,0,1,0,1,0,0};
        test7 = new int[]{1,0,0,0,1};

    }

    @Test
    public void testCanPlaceFlowers(){
        assertFalse(CanPlaceFlowers.canPlaceFlowers(test1, 2));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(test2, 1));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(test3, 1));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(test4, 1));
        assertFalse(CanPlaceFlowers.canPlaceFlowers(test5, 2));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(test7, 1));
        assertTrue(CanPlaceFlowers.canPlaceFlowers(test6, 1));
    }
}
