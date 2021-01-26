package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidMountainArrayTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    int[] test6;
    int[] test7;

    @BeforeEach
    public void setUp() {
        test1 = new int[]{};
        test2 = new int[]{1, 3, 2};
        test3 = new int[]{1, 2};
        test4 = new int[]{3, 5, 5};
        test5 = new int[]{0, 3, 2, 1};
        test6 = new int[]{0, 2, 3, 4, 5, 2, 1, 0};
        test7 = new int[]{0, 2, 3, 3, 5, 2, 1, 0};
    }

    @Test
    public void testValidMountainArray() {
        assertTrue(ValidMountainArray.isValidMountainArray(test2));
        assertFalse(ValidMountainArray.isValidMountainArray(test1));
        assertFalse(ValidMountainArray.isValidMountainArray(test3));
        assertFalse(ValidMountainArray.isValidMountainArray(test4));
        assertTrue(ValidMountainArray.isValidMountainArray(test5));
        assertTrue(ValidMountainArray.isValidMountainArray(test6));
        assertFalse(ValidMountainArray.isValidMountainArray(test7));
    }
}

