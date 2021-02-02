package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArraysTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{1, 2, 2, 1};
        test2 = new int[]{2, 2};
        test3 = new int[]{};
        test4 = new int[]{4, 9, 5};
        test5 = new int[]{9, 4, 9, 8, 4};
    }

    @Test
    public void testIntersection() {
        assertArrayEquals(new int[]{2}, IntersectionOfTwoArrays.intersection(test1, test2));
        assertArrayEquals(new int[]{}, IntersectionOfTwoArrays.intersection(test1, test3));
        assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays.intersection(test4, test5));
    }
}
