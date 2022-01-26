package com.generics.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicates<K> {
    static Predicate<Integer> isEven = (number) -> number % 2 == 0;
    static Predicate<Integer> isOdd = (number) -> number % 2 != 0;
    private static <T extends Integer> long counter(Collection<T> items, Predicate<T> predicate) {
        return items.stream().filter(predicate).peek(System.out::println).count();
    }

    public static <T> void createArray(T sample){
        ArrayList<T> list = new ArrayList<T>();
        list.add(sample);
        list.forEach(i -> System.out.println(" i > " + i));
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,10,30,5,12,18,17);
        long evenCount = counter(integerList,isEven);
        System.out.println("--" );
        long oddCount = counter(integerList, isOdd);
        System.out.println("--" );
        System.out.println("even count " + evenCount);
        System.out.println("--" );
        System.out.println("odd count " + oddCount);

        createArray("generic");;
    }
}
