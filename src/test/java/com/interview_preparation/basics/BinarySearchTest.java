package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;

    @BeforeEach
    public void setUp() {
        test1 = new int[]{};
        test2 = new int[]{2};
        test3 = new int[]{2, 3};
        test4 = new int[]{-1, 0, 3, 5, 9, 12};
        test5 = new int[]{-1, 0, 3, 5, 9, 12};
    }

    @Test
    public void testFindIndex() {
        assertEquals(-1, BinarySearch.findIndex(test1, 3));
        assertEquals(-1, BinarySearch.findIndex(test2, 3));
        assertEquals(0, BinarySearch.findIndex(test2, 2));
        assertEquals(-1, BinarySearch.findIndex(test3, 4));
        assertEquals(1, BinarySearch.findIndex(test3, 3));
        assertEquals(4, BinarySearch.findIndex(test4, 9));
        assertEquals(-1, BinarySearch.findIndex(test5, 2));
    }
}
