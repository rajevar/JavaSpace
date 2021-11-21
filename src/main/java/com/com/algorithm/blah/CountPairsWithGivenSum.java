package com.com.algorithm.blah;
/*
    Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array
    whose sum is equal to ‘sum’.

    **** THIS ONLY WORKS FOR PAIRS..
 */
public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 7, -1, 5};
        int sum = 6;
        // output : 3  [1,5; 7,-1; 5,1]
        int result = find(arr, sum);
        assert result/2 == 3;
        arr = new int[]{10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        sum = 11;
        result = find(arr, sum);
        assert result/2 == 9;
        System.out.println("Done..");
    }

    // Time Complexity : O(n2)
    private static int find(int[] arr, int sum) {
        int counter = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++){
                if( (arr[i] + arr[j])  == sum) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int betterFind(int[] arr, int sum) {
        // Going to try for numbers of any combination, not pairs
        // https://leetcode.com/problems/combination-sum/
        return -1;
    }
}
