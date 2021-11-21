package com.lambda;


public class Printer {

    public void print(FirstInterface firstInterface){
        firstInterface.singleMethod("apple");
        firstInterface.singleMethod("banana");
    }

    public static void main(String args[]){
        FirstInterface fi = param -> System.out.println("My lambda says "+ param);
        Printer printer=new Printer();
        printer.print(fi);
    }
}