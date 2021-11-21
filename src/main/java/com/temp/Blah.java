package com.temp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Blah {

    static void reverse() {
        String s ="Hello World";
        char arr[] = s.toCharArray();
        char a2 [] = new char[arr.length];
        for(int i = 0; i < arr.length ; i++) {
            a2[i] = arr[arr.length - i - 1];
        }
        System.out.println(a2);
    }

    static void missingNumber() {
        int arr[] =  new int[]{1,8,2,4,3,7,6};
        // n * ( n + 1 ) / 2
        int arrCount = 0;
        int size = arr.length + 1;
        int total =  size * (size + 1 ) / 2;
        for (int element: arr ) {
            arrCount += element;
        }
        System.out.println("\n" + (total-arrCount)) ;
    }

    static void checkSum(){
        int arr[] =  new int[]{1,8,2,4,3,7,6};
        int check = 1;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int sum = 0;
        boolean hasFound = false;
        for(int elem: arr) {
            sum = check - elem;
            if(hashSet.contains(sum)) {
                hasFound = true;
                break;
            }
            hashSet.add(elem);
        }
        System.out.println(" --> " + hasFound);
    }
    public static void main(String[] args) {
        reverse();
        //missingNumber();
        checkSum();
    }
}
