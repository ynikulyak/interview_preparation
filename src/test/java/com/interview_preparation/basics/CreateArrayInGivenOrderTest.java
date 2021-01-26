package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateArrayInGivenOrderTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] index1;
    int[] index2;
    int[] index3;
    int[] index4;
    int[] index5;
    int[] index6;

    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{2};
        test3 = new int[]{0,1,2,3,4};
        test4 = new int[]{1,2,3,4,0};

        index1 = new int[]{};
        index2 = new int[]{0};
        index3 = new int[]{0,1,2,2,1};
        index4 = new int[]{0,1,2,3,0};
        index5 = new int[]{2};
        index6 = new int[]{2, 3};
    }

    @Test
    public void testCreateArrayInGivenOrder(){

        assertArrayEquals(new int[]{}, CreateArrayInGivenOrder.createTargetArray(test1, index1));
        assertArrayEquals(new int[]{}, CreateArrayInGivenOrder.createTargetArray(test1, index6));
        assertArrayEquals(new int[]{2}, CreateArrayInGivenOrder.createTargetArray(test2, index2));
        assertArrayEquals(new int[]{0,4,1,3,2}, CreateArrayInGivenOrder.createTargetArray(test3, index3));
        assertArrayEquals(new int[]{0,1,2,3,4}, CreateArrayInGivenOrder.createTargetArray(test4, index4));
    }


}
