package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumThreeIsZeroTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    int[] test6;

    List<List<Integer>> expected1 = new ArrayList<List<Integer>>();
    List<List<Integer>> expected2 = new ArrayList<List<Integer>>();
    List<List<Integer>> expected3 = new ArrayList<List<Integer>>();
    List<List<Integer>> expected4 = new ArrayList<List<Integer>>();
    List<List<Integer>> expected5 = new ArrayList<List<Integer>>();
    List<List<Integer>> expected6 = new ArrayList<List<Integer>>();


    @BeforeEach
    public void setUp(){
        test1 = new int[]{};
        test2 = new int[]{1, 2};
        test3 = new int[]{-3, 0, 1, 2, -1, 1, -2};
        test4 = new int[]{-5, 2, -1, -2, 3};
        test5 = new int[]{-1,0,1,2,-1,-4};
        test6 = new int[]{-2,0,1,1,2};
        
        expected3.add(Arrays.asList(-3, 1, 2));
        expected3.add(Arrays.asList(-2, 0, 2));
        expected3.add(Arrays.asList(-2, 1, 1));
        expected3.add(Arrays.asList(-1, 0, 1));

        expected4.add(Arrays.asList(-5, 2, 3));
        expected4.add(Arrays.asList(-2, -1, 3));

        expected5.add(Arrays.asList(-1,-1,2));
        expected5.add(Arrays.asList(-1,0,1));

        expected6.add(Arrays.asList(-2,0,2));
        expected6.add(Arrays.asList(-2,1,1));
    }

    @Test
    public void testSum(){

        assertEquals(expected1, SumThreeIsZero.sumThreeElement(test1));
        assertEquals(expected2, SumThreeIsZero.sumThreeElement(test2));
        assertEquals(expected3, SumThreeIsZero.sumThreeElement(test3));
        assertEquals(expected4, SumThreeIsZero.sumThreeElement(test4));
        assertEquals(expected5, SumThreeIsZero.sumThreeElement(test5));
        assertEquals(expected6, SumThreeIsZero.sumThreeElement(test6));
    }
}
