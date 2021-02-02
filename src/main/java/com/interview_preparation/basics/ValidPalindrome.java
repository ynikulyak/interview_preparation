package com.interview_preparation.basics;

/**Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    /**
     * Check if a string is a palindrome.
     * Since the input string contains characters that we need to ignore in our palindromic check,
     * traversing inwards from both ends of the string, we can expect to see the same characters, in the same order
     *
     * @param s string to determine if it's a palindrome
     * @return true if palindrome, false if not
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static boolean isValidPalindrome(String s){
        //empty string is a valid palindrome
        if(s.length() < 2){
            return true;
        }

        //first pointer at the beginning of the string
        int i = 0;
        //second pointer at the end of the string
        int j = s.length()-1;

        //start traversing inwards from both ends of the string,
        // we can expect to see the same characters, in the same order.
        while(i < j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            //ignore non-alphabetic chars from the beginning
            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }

            //ignore non-alphabetic chars from the end
            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }

            //if at any point chacacters from both sides are not equal, break, it's not a palindrome
            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
