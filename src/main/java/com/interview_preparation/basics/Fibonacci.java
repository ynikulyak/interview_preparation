package com.interview_preparation.basics;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that
 * each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */
public class Fibonacci {

    /**
     * Return Fibonacci. Use iterative approach without memoization to not use additional memory space
     * @param n number to calculate fibonacci
     * @return int Fibonacci number
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int iterativeFib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        //1 unit of memory
        int fib = 0;
        //fib(N-1), 1 unit of memory
        int prev = 1;
        //fib(N-2), 1 unit of memory
        int twoStepsPrev = 0;

        //Iterate, incrementally by 1, all the way up to and including N.
        for(int i = 2; i <= n; i++){

            //fib(N-1) + fib(N-2)
            fib = prev + twoStepsPrev;
            twoStepsPrev = prev;
            prev = fib;
        }
        return fib;
    }

    /**
     * Return fibonacci, using Binet's formula golden ratio
     * @param n number to calculate fibonacci.
     * @return int finobacci.
     */
    public static int goldenRatio(int n){
        double positiveGolden = (1+ Math.sqrt(5))/2;
        double negativeGolden = (1-Math.sqrt(5))/2;

        return (int)Math.round((Math.pow(positiveGolden, n) - Math.pow(negativeGolden, n))/Math.sqrt(5));
    }
}
