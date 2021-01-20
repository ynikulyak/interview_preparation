package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoveZeroesTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    int[] test6;
    int[] test7;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{0, 0, 0, 0, 0, 1};
        test2 = new int[]{0};
        test3 = new int[]{9, 0, 8, 0, 7, 0, 6, 0, 5, 0};
        test4 = new int[]{};
        test5 = new int[]{0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 4};
        test6 = new int[]{0,1,0,3,12};
        test7 = new int[]{1, 0, 2, 9, 8, 7, 0, 3, 0};
    }

    @Test
    public void testMoveZeroes(){
        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0}, MoveZeros.moveZeroes(test1));
        assertArrayEquals(new int[]{0}, MoveZeros.moveZeroes(test2));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5,0, 0, 0, 0, 0 }, MoveZeros.moveZeroes(test3));
        assertArrayEquals(new int[]{}, MoveZeros.moveZeroes(test4));
        assertArrayEquals(new int[]{1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, MoveZeros.moveZeroes(test5));
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, MoveZeros.moveZeroes(test6));
        assertArrayEquals(new int[]{1, 2, 9, 8, 7, 3, 0, 0, 0}, MoveZeros.moveZeroes(test7));
    }
}
