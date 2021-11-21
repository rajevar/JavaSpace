package com.com.algorithm;

public class FibTest {

    public static void main(String[] args) {
        int num = 6;
        for (int i=0; i<num; i++) {
            int v = fib(i);
            System.out.print(v + " ");
        }

    }

    public static int fib(int n) {
        if(n < 2) {
            return  1;
        }
        return fib(n-1) + fib (n - 2);
    }
}
