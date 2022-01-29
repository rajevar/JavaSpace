package com.redo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* #1
Input > 3 7 1 2 8 4 5
Answer > 6
O(n)
*/
public class MissingNum {

    public static void main(String[] args) {
        int arr[] = { 3, 7, 1, 2,8,4,5};
        int n = arr.length + 1;
        int sum =  (n * (n+1))/2;
        int totalSum = Arrays.stream(arr).sum();
        int missing = sum - totalSum;
        System.out.println(missing);
        arr = new int[] {1, 5, 7, -1, 5};
        System.out.println("hasMatch: " + checkSumOfTwo(arr, 6));
    }

    private static boolean checkSumOfTwo(int arr[], int sum) {
        boolean foundMatch = false;
        int counter = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i <arr.length;i++) {
            int expected = sum - arr[i];
            if(map.get(expected) != null) {
                System.out.println("Exp: " + expected + " || " + map.get(expected) + " -- " + arr[i]);
                foundMatch = true;
                counter ++;
                //break;
            }
            map.put(arr[i],i);
        }
        System.out.println("Total matching pairs : " + counter);
        return  foundMatch;
    }
}
