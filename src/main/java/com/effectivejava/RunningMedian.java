package com.effectivejava;

//public class RunningMedian {
//
//    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,7,9,10,23};
//        int size = a.length;
//        int mid = size / 2;
//        System.out.println("mid > " + mid);
//        double med = 0;
//        if(size % 2 == 0 ) {
//            System.out.println(a[mid] + " - " + a[mid - 1]);
//            med = (a[mid] + a[mid-1]) / 2.0;
//        } else {
//            med = a[mid];
//        }
//        System.out.println(med);
//    }
//}

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class RunningMedian {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
        //Arrays.sort(a);
        double[] d = new double[a.length];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i< a.length; i++) {
            list.add(a[i]);
            int size = list.size();
            double med = 0;
            if(i > 0) {
                Collections.sort(list);
                int mid = size / 2;
                if(size % 2 == 0 ) {
                    med = (list.get(mid) + list.get(mid-1)) / 2.0;
                } else {
                    med = list.get(mid);
                }
                d[i] = med;
            } else {
                d[i] = list.get(0);
            }
        }
        return d;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("median.txt"));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

