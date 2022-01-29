package com.justjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class SubStringCount {

    public static void main(String[] args) {
        String str = "abcabcab"; // returns
        int size = 2; // ab=3, bc=2, ca=2 ==> 3+2+2=7
        int result = count(str, size);
        System.out.println("result : " + result);
    }

    public static int count(String input, int size) {
        AtomicInteger result = new AtomicInteger();
        if(Objects.isNull(input) || size < 0) {
            return result.get();
        }
        int startIndex = 0;
        Map<String,Integer> map = new HashMap<>();

        for(int i=size; i<=input.length();i++) {
            String subStr = input.substring(startIndex, i);
            System.out.println("substr: " + subStr);
            map.put(subStr, map.getOrDefault(subStr,0)+1);
            startIndex ++;
        }
        map.forEach((k,v) -> {
            System.out.println("key: " + k + " | val: " + v );
            if(v > 1) result.addAndGet(v);
        });
        return result.get();
    }
}
