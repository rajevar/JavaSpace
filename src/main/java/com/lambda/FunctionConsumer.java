package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionConsumer {

//    static void display() {
//        Consumer<Integer> display = i -> System.out.println(i);
//        display.accept(1);
//    }

    static void listNumbers(List<Integer> intArray) {
        Consumer<List<Integer>> modify = list -> {
            for(int i=0; i< list.size(); i++) {
                list.set(i, list.get(i) * 100);
            }
        };
        Consumer<List<Integer>> display = list -> list.stream().forEach(System.out::println);
        modify.andThen(display).accept(intArray);
    }

    public static void main(String[] args) {
        //FunctionConsumer.display();
        List<Integer> intArray = Arrays.asList(1,2,3);
        FunctionConsumer.listNumbers(intArray);
    }
}
