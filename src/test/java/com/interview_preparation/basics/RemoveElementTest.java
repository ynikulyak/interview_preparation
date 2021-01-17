package com.interview_preparation.basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;
    @BeforeEach
    public void setUp(){
        test1 = new int[]{3,2,2,3};
        test2 = new int[]{1,2,3,5,4};
        test3 = new int[]{4,1,2,3,5};
        test4 = new int[]{0,1,2,2,3,0,4,2};
        test5 = new int[]{};
    }

    @Test
    public void testRemoveElement(){
        assertEquals(2, RemoveElement.removeElement(test1, 3));
        assertEquals(4, RemoveElement.removeElement(test2, 4));
        assertEquals(4, RemoveElement.removeElement(test3, 4));
        assertEquals(5, RemoveElement.removeElement(test4, 2));
        assertEquals(0, RemoveElement.removeElement(test5, 2));
    }

    @Test
    public void testRemoveElementWithoutMovingElementsOneStepLeft(){
        assertEquals(2, RemoveElement.removeElement(test1, 3));
        assertEquals(4, RemoveElement.removeElement(test2, 4));
        assertEquals(4, RemoveElement.removeElement(test3, 4));
        assertEquals(5, RemoveElement.removeElement(test4, 2));
        assertEquals(0, RemoveElement.removeElement(test5, 2));
    }
}
