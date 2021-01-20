package com.interview_preparation.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReserseStringTest {

    char[] test1 = {};
    char[] test2 = {'a'};
    char[] test3 = {'h','e','l','l','o'};
    char[] test4 = {'H','a','n','n','a','h'};

    @Test
    public void testReverseString(){
        assertArrayEquals(new char[]{}, ReverseString.reverseString(test1));
        assertArrayEquals(new char[]{'a'}, ReverseString.reverseString((test2)));
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, ReverseString.reverseString(test3));
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, ReverseString.reverseString(test4));
    }
}
