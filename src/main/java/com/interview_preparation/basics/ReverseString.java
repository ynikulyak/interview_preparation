package com.interview_preparation.basics;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 */
public class ReverseString {

    /**
     * Function that reverses a string
     *
     * @param s The input string is given as an array of characters
     * @return new array in reversed order
     */
    public static char[] reverseString(char[] s){
        if(s.length < 2){
            return s;
        }

        //two pointers
        int start = 0;
        int end = s.length-1;

        //traverse till the middle of the string
        while(start < end){
            //swap elemnts
            char temp = s[start];
            s[start] =  s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }
}
