package com.com.algorithm.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/
// https://leetcode.com/problems/product-of-array-except-self/discuss/65622/Simple-Java-solution-in-O(n)-without-extra-space
// #238
public class ProdOfArray {

    static void product(int arr[]) {
        int size = arr.length;
        int res[] = new int[size];
        for (int i=0; i<size; i++) {
            int prod = 1;
            for (int j=0; j<size; j++) {
                if(i != j) {
                    prod = prod * arr[j];
                }
            }
            res[i] = prod;
        }
        System.out.println(Arrays.toString(res));
    }

    static public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        // Calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            res[i] = left;
        }
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right = right * nums[i + 1];
            res[i] *= right;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        product(arr);
        productExceptSelf(arr);
    }
}
