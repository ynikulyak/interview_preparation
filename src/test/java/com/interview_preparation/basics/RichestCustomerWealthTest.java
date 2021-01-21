package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthTest {

    int[][] test1;
    int[][] test2;
    int[][] test3;
    int[][] test4;
    int[][] test5;

    @BeforeEach
    public void setUp(){
        test1 = new int[][]{{}, {}};
        test2 = new int[][]{{1},{1}};
        test3 = new int[][] {{1,2,3},{3,2,1}};
        test4 = new int[][] {{1,5},{7,3},{3,5}};
        test5 = new int[][] {{2,8,7},{7,1,3},{1,9,5}};
    }

    @Test
    public void testMaxWealth(){
        assertEquals(1, RichestCustomerWealth.maxWealth(test2));
        assertEquals(6, RichestCustomerWealth.maxWealth(test3));
        assertEquals(10, RichestCustomerWealth.maxWealth(test4));
        assertEquals(17, RichestCustomerWealth.maxWealth(test5));
        assertEquals(0, RichestCustomerWealth.maxWealth(test1));
    }
}
