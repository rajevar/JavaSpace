package com.com.algorithm;

public class Fib {

    static int fib(int n) {
        if (n<2) {
            return  1;
        }
        return fib(n-1) + fib (n - 2);
    }

    static int fibanocci(int x) {
        if (x < 2) {
            return  1;
        }
        int a = 1, b=1, fib = 0;
        for (int i=2; i<=x; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("recursive " + fib(x));
        for ( int i=0; i<=5; i++ ) {
            System.out.println(fibanocci(i));
        }
    }
}
