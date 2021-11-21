package com.com.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]) {
        for (int i=0; i< arr.length-1; i++) {
            for(int j=0; j< arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,6, 2, 9, 3};
        sort(arr);
        bubbleSort(arr);
    }
}