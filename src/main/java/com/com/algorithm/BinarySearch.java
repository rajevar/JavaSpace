package com.com.algorithm;

/**
 * Binary search is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly
 * dividing in half the portion of the list that could contain the item, until you've narrowed down the possible
 * locations to just one.
 */
public class BinarySearch {

    private int binarySearch(int array[], int left, int right, int toFind) {
        if(right >= left) {
            int mid = (left + right) / 2;
            if(array[mid] == toFind) {
                return mid;
            }
            if(array[mid] > toFind) {
                binarySearch(array, left, mid-1, toFind);
            }
            binarySearch(array, mid+1, right, toFind);
        }

        return  -1;
    }

    private int recursiveSearch(int arr[], int low, int high, int value) {

        if(low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == value) {
            return mid;
        }
        if(arr[mid] < value) {
            recursiveSearch(arr, mid+1, high, value);
        } else {
            recursiveSearch(arr, low, mid-1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        BinarySearch bs = new BinarySearch();
        int index = bs.binarySearch(array, 0, array.length-1, 9);
        assert index == -1;
        index = bs.binarySearch(array, 0, array.length-1, 1);
        assert index == 0;
        index = bs.binarySearch(array, 0, array.length-1, 2);
        assert index == 1;
        index = bs.binarySearch(array, 0, array.length-1, 3);
        assert index == 2;
        index = bs.binarySearch(array, 0, array.length-1, 4);
        assert index == 3;
        index = bs.binarySearch(array, 0, array.length-1, 5);
        assert index == 4;
        index = bs.binarySearch(array, 0, array.length-1, 6);
        assert index == 5;
        index = bs.binarySearch(array, 0, array.length-1, 7);
        assert index == 6;

        index = bs.recursiveSearch(array, 0, array.length-1, 9);
        assert index == -1;
        index = bs.recursiveSearch(array, 0, array.length-1, 1);
        assert index == 0;
        index = bs.recursiveSearch(array, 0, array.length-1, 2);
        assert index == 1;
        index = bs.recursiveSearch(array, 0, array.length-1, 3);
        assert index == 2;
        index = bs.recursiveSearch(array, 0, array.length-1, 4);
        assert index == 3;
        index = bs.recursiveSearch(array, 0, array.length-1, 5);
        assert index == 4;
        index = bs.recursiveSearch(array, 0, array.length-1, 6);
        assert index == 5;
        index = bs.recursiveSearch(array, 0, array.length-1, 7);
        assert index == 6;

        System.out.println(" \n -- All Good! -- End of program");
    }
}
