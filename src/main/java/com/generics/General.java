package com.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class General {

    public static <T> int count(Collection<T> col, T item) {
        int count = 0;
        if (item == null) {
            for (T element : col) {
                if (element == null) count++;
            }
        } else {
            for (T element : col) {
                if (item.equals(element)) {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1);
        int count = count(integers, 1);
        System.out.println("#occurrences of 1s: " + count);
        count = count(integers, null);
        System.out.println("#occurrences of 1s: " + count);
    }
}
