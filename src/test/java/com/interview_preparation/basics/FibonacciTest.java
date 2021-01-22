package com.interview_preparation.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacciIterative(){
        assertEquals(0, Fibonacci.iterativeFib(0));
        assertEquals(1, Fibonacci.iterativeFib(1));
        assertEquals(1, Fibonacci.iterativeFib(2));
        assertEquals(3, Fibonacci.iterativeFib(3));
        assertEquals(5, Fibonacci.iterativeFib(4));
        assertEquals(8, Fibonacci.iterativeFib(5));
        assertEquals(13, Fibonacci.iterativeFib(6));
        assertEquals(21, Fibonacci.iterativeFib(7));
        assertEquals(34, Fibonacci.iterativeFib(8));
        assertEquals(55, Fibonacci.iterativeFib(9));
        assertEquals(89, Fibonacci.iterativeFib(10));
        assertEquals(144, Fibonacci.iterativeFib(11));
        assertEquals(233, Fibonacci.iterativeFib(12));
        assertEquals(377, Fibonacci.iterativeFib(13));
    }

    @Test
    public void testGoldenRatio(){
        assertEquals(0, Fibonacci.goldenRatio(0));
        assertEquals(1, Fibonacci.goldenRatio(1));
        assertEquals(1, Fibonacci.goldenRatio(2));
        assertEquals(2, Fibonacci.goldenRatio(3));
        assertEquals(3, Fibonacci.goldenRatio(4));
        assertEquals(5, Fibonacci.goldenRatio(5));
        assertEquals(8, Fibonacci.goldenRatio(6));
        assertEquals(13, Fibonacci.goldenRatio(7));
        assertEquals(21, Fibonacci.goldenRatio(8));
        assertEquals(34, Fibonacci.goldenRatio(9));
        assertEquals(55, Fibonacci.goldenRatio(10));
        assertEquals(89, Fibonacci.goldenRatio(11));
        assertEquals(144, Fibonacci.goldenRatio(12));
        assertEquals(233, Fibonacci.goldenRatio(13));
        assertEquals(377, Fibonacci.goldenRatio(14));
    }
}
