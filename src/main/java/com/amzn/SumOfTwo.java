package com.amzn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * #2
  Input > 3 7 1 2 8 4 5 , 10
  Answer > true
 Input > 3 7 1 2 8 4 5 , 20
  Answer > false
 */
public class SumOfTwo {

    static boolean checkSum(int arr[], int value) {

        List<Integer> list = new ArrayList<>();
        for(int num : arr) {
            if(list.contains(value-num)) {
                return true;
            }
            list.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        boolean b = checkSum(new int[] {2,3,7,1,8,4,5}, 10);
        assert b == true;
        b = checkSum(new int[] {2,3,7,1,8,4,5}, 20);
        assert b == false;
        System.out.println(" all good.");
    }
}
