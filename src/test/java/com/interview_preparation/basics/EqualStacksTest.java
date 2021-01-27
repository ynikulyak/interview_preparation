package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualStacksTest {

    List<Integer> list1;
    List<Integer> list2;
    List<Integer> list3;
    List<Integer> list4;
    List<Integer> list5;
    List<Integer> list6;
    List<Integer> list7;
    List<Integer> list8;
    List<Integer> list9;

    @BeforeEach
    public void setUp() {
        list1 = new ArrayList<>(Arrays.asList(3, 2, 1, 1, 1));
        list2 = new ArrayList<>(Arrays.asList(4, 3, 2));
        list3 = new ArrayList<>(Arrays.asList(1, 1, 4, 1));
        list4 = new ArrayList<>(Arrays.asList(1, 2, 1, 1));
        list5 = new ArrayList<>(Arrays.asList(1, 1, 2));
        list6 = new ArrayList<>(Arrays.asList(1, 1));
        list7 = new ArrayList<>();
        list8 = new ArrayList<>(Arrays.asList(1, 1, 2));
        list9 = new ArrayList<>(Arrays.asList(1, 1));
    }

    @Test
    public void testEqualStacks() {
        assertEquals(5, EqualStacks.equalStacks(list1, list2, list3));
        assertEquals(2, EqualStacks.equalStacks(list4, list5, list6));
        assertEquals(0, EqualStacks.equalStacks(list7, list8, list9));
    }
}
