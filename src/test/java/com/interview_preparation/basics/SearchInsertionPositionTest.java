package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertionPositionTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{1};
        test3 = new int[]{1,3};
        test4 = new int[]{1,3,5,6};
    }

    @Test
    public void testSearchInsertionPosition(){

        assertEquals(0, SearchInsertPosition.searchPosition(test1, 1));
        assertEquals(0, SearchInsertPosition.searchPosition(test2, 0));
        assertEquals(1, SearchInsertPosition.searchPosition(test2, 2));
        assertEquals(1, SearchInsertPosition.searchPosition(test3, 2));
        assertEquals(0, SearchInsertPosition.searchPosition(test4, 0));
        assertEquals(2, SearchInsertPosition.searchPosition(test4, 4));
        assertEquals(4, SearchInsertPosition.searchPosition(test4, 7));
    }
}
