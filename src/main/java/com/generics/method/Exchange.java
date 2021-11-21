package com.generics.method;

public class Exchange {
    private static <T> void  swap(T[] items, int x, int y) {
        T temp = items[x];
        items[x] = items[y];
        items[y] = temp;
    }
    public static void main(String[] args) {
        String[] strArr = new String[]{ "1","2","133","181" };
        for(String s: strArr) {
            System.out.println(s);
        }
        System.out.println(" --- ");
        swap(strArr, 0,2);
        for(String s: strArr) {
            System.out.println(s);
        }
    }
}
