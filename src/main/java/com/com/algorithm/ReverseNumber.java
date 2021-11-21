package com.com.algorithm;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 12340, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            System.out.println("d: " + digit + " rev: " + reversed + " num: " + num);
        }
        System.out.println("Reversed Number: " + reversed);
    }
}