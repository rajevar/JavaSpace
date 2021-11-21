package com.com.algorithm.sort;

import java.util.Arrays;

/**
 * Divide and conquer concept
 * An element is in the sorted position if all th elements to its left are smaller and to its right are greater.
 * Not the fastest sort algorithm
 * Best:Ω(n log(n))	Avg: θ(n log(n))	Worst: O(n^2)
 *
 *
 */
public class QuickSort {

    static int partition(int low, int high, int[] arr) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void quickSort(int low, int high, int[] arr) {
        if(low < high) {
            int j = partition(low, high, arr);
            quickSort(low, j-1, arr);
            quickSort(j+1, high, arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1,10, 2, 8, 1, 20,7, 4};
        quickSort(0, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
