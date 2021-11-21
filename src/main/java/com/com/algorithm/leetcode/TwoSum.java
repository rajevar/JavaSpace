package com.com.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map
                = new HashMap<Integer, Integer>();
        int complement;
        //loop to check every element in the array
        for (int i = 0; i<nums.length; i++) {
            complement = target - nums[i];
            //if we already have the complement in HashMap,
            //return an array that contains indices of them.
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            //if its complement is not in HashMap but in the array,
            //they will be matched when the complement is
            //regarded as current element.
            //add current element into HashMap.
            map.put(nums[i], i);
        }
        //Exception which says it is unavailable to find solution
        //with these arguments.
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int arr[] = {2, 7, 1, 5};
        int[] result = sum.myImpl(arr, 8);
        for (int element: result) {
            System.out.println(element);
        }
        result = sum.testImp(arr, 8);
        System.out.print(result.toString());

    }

    private int[] testImp(int[] arr, int data) {

        List<Integer> list= new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            int compute = data - arr[i];
            if(list.contains(compute)) {
                return new int[] { arr[i], compute };
            } else {
                list.add(arr[i]);
            }
        }

        throw new IllegalArgumentException("No solution");
    }

    private int[] myImpl(int[] arr, int target) {
        HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
        int compute = 0;
        for(int i=0; i<arr.length; i++){
            compute = target - arr[i];
            if(map.containsKey(compute)) {
                return new int[]{ map.get(compute), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

}
