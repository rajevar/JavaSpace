package com.com.algorithm.blah;

import java.util.Stack;

public class MidArray {
    static  int middle(int arr[]) {
        int count=0;
        try {
            while(String.valueOf(arr[count]) != null) {
                System.out.println(arr[count]);
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException ae) {

        }
        System.out.println(arr[count/2]);
        return arr[count/2];
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-10,1,3,4, 19};
        assert middle(arr) == 3;
    }
}
