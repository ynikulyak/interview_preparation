package com.interview_preparation.basics;

import java.util.List;

/**
 * You have three stacks of cylinders where each cylinder has the same diameter,
 * but they may vary in height. You can change the height of a stack by removing
 * and discarding its topmost cylinder any number of times.
 *
 * Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
 * This means you must remove zero or more cylinders from the top of zero or more of the three stacks
 * until they are all the same height, then return the height.
 *
 * Time Complexity: O(n1 + n2 + n3)
 * Space Complexity: O(1)
 */
public class EqualStacks {

    /**
     *
     * @param stack1 list of integers
     * @param stack2 list of integers
     * @param stack3 list of integers
     * @return int maximum height such that all stacks are equal
     */
    public static int equalStacks(List<Integer> stack1, List<Integer> stack2, List<Integer> stack3) {
        //check if any of stacks is empty, return 0
         if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
             return 0;
         }
         //find sum of each stack
         int sum1 = 0;
         int sum2 = 0;
         int sum3 = 0;

         for (int i = 0; i < stack1.size(); i++) {
             sum1 += stack1.get(i);
         }

         for (int i = 0; i < stack2.size(); i++) {
             sum2 += stack2.get(i);
         }

         for (int i = 0; i < stack3.size(); i++) {
             sum3 += stack3.get(i);
         }

         //repeat operations till terminates
         while (true) {

             //if all three sums are equal, return any
             if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
             }

             //if any of stacks is empty, can't go further, return 0
             if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) {
                 return 0;
             }

             //if first stack is greater
             if (sum1 >= sum2 && sum1 >= sum3) {
                 //reduce the sum by the top element
                 sum1 -= stack1.get(0);
                 //remove top element
                 stack1.remove(0);
             }else if (sum2 >= sum1 && sum2 >= sum3) { //if second sum is greater
                 //reduce the sum by top element
                 sum2 -= stack2.get(0);
                 //remove top element
                 stack2.remove(0);
             }else if (sum3 >= sum1 && sum3 >= sum2) { //if third sum is greater
                 //reduce the sum by the top element
                 sum3 -= stack3.get(0);
                 //remove the top element
                 stack3.remove(0);
             }
         }
    }
}
