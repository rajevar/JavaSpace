package com.com.algorithm;

// https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html

public class Fibonacci {
    /*
        sum of last 2 numbers
        5 --> 1, 1, 2, 3, 5
     */
    static int fibonacci(String str, int n) { // using recursion
        //System.out.println(  str + "|| n is > " + n);
        if( n == 1 || n == 2 ) { //
            return 1;
        }
        int n_1 =  fibonacci("first", n-1);
        int n_2 = fibonacci("second", n-2);
        //System.out.println( n + " ----- n_1 : " + n_1 + " |n_2: " + n_2 );
        return  n_1 + n_2;
    }

    static int fibonacci2(int number) {
        if (number ==1 || number == 2) {
            return 1;
        }

        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.println("fib1 > " + fibo1 + " fib02 > " + fibo2 + " fib >> " + fibonacci + " || ");
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        int x = 6; // find series for 5
        for(int i=1; i<=x; i++) {

            //System.out.println("\n i >> " + i);
            System.out.println("series >>> " + fibonacci("index", i) + " ");
            //System.out.println(fibonacci2(i) +" ");
        }
        int v = 2;
        v += ++v;
        System.out.println("v > " + v);
    }
}
