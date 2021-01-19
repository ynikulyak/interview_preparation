package com.interview_preparation.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidPalindromeTest {

    @Test
    public void testValidPalindrome(){
        assertTrue(ValidPalindrome.isValidPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(ValidPalindrome.isValidPalindrome(""));
        assertTrue(ValidPalindrome.isValidPalindrome("a"));

        assertFalse(ValidPalindrome.isValidPalindrome("race a car"));
        assertFalse(ValidPalindrome.isValidPalindrome("0P"));
    }
}
