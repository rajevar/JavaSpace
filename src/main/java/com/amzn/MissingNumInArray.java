package com.amzn;

/* #1
Input > 3 7 1 2 8 4 5
Answer > 6
O(n)
*/

public class MissingNumInArray {

    static int findMissing(int[] arr) {
        // equation: sum of 1 to n = n(n+1) / 2
        int arrayTotal=0;
        int size = arr.length + 1;
        int sum = size * (size + 1) / 2;
        int test = 0; // to add numbers without using the equation above.
        for(int i=0;i< size-1; i++) {
            arrayTotal += arr[i];
            test = test + i + 1;
        }
        test += size;
        System.out.println("test > " + (test-arrayTotal));
        return sum-arrayTotal;
    }
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,7,1,8,4,5};
        int missing = findMissing(arr);
        assert missing == 6;

        arr = new int[] {2,6,7,1,8,4,5,9,10};
        missing = findMissing(arr);
        assert missing == 3;

        System.out.println("all good.");
    }
}
