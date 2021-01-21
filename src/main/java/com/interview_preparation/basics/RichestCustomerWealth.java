package com.interview_preparation.basics;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the customer i has
 * in the j bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {

    /**
     * Return the maximum wealth of a customer.
     *
     * @param accounts 2D array, where i is a customer, j is a bank account
     * @return int the maximum wealth of a customer
     */
    public static int maxWealth(int[][] accounts){
        if(accounts.length < 2){
            return accounts[0][0];
        }
        //current max wealth
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            //sum of the current customer
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            //if the wealth of the customer is greater that the current max wealth
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
