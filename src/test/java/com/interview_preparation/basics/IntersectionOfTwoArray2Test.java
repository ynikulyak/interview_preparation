package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArray2Test {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{1,2,2,1};
        test3 = new int[]{2, 2};
        test4 = new int[]{4,9,5};
        test5 = new int[]{9,4,9,8,4};
    }

    @Test
    public void testIntersectionWithSort(){
        assertArrayEquals(new int[]{}, IntersectionOfTwoArrays2.intersectionUsingSort(test1, test2));
        assertArrayEquals(new int[]{2, 2}, IntersectionOfTwoArrays2.intersectionUsingSort(test2, test3));
        assertArrayEquals(new int[]{4, 9}, IntersectionOfTwoArrays2.intersectionUsingSort(test4, test5));
        assertArrayEquals(new int[]{}, IntersectionOfTwoArrays2.intersectionUsingSort(test4, test2));
    }

    @Test
    public void testIntersectionWithHashMap(){
        assertArrayEquals(new int[]{}, IntersectionOfTwoArrays2.intersectionUsingHashMap(test1, test2));
        assertArrayEquals(new int[]{2, 2}, IntersectionOfTwoArrays2.intersectionUsingHashMap(test2, test3));
        assertArrayEquals(new int[]{9, 4}, IntersectionOfTwoArrays2.intersectionUsingHashMap(test4, test5));
        assertArrayEquals(new int[]{}, IntersectionOfTwoArrays2.intersectionUsingHashMap(test4, test2));
    }
}
