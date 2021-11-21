package com.lambda.code;


import java.util.function.BiFunction;
import java.util.function.Function;

public class CustomerDiscount {
    // the usual way
    private double applyDiscount(int price, double discount) {
        return price - (price * discount / 100);
    }

    public Function<Integer, Double> tenPercent = price -> price - price * 0.1 ;

    public static void main(String[] args) {
        CustomerDiscount discount = new CustomerDiscount();
        double price = discount.applyDiscount(100,10);
        System.out.println(price);
        double p2 = discount.tenPercent.apply(100);
        System.out.println(p2);
    }
}
