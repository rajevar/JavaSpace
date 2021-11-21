package com.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex1 {
    Consumer<Vehicle> printCar = System.out::println;
    public void print(List<? extends Vehicle> list ) {
        list.forEach(printCar);
    }
    public static void main(String[] args) {
        Car c1 = new Car("T");
        Car c2 = new Car("X");
        List<Car> cars = Arrays.asList(c1,c2);
        Ex1 ex1 = new Ex1();
        ex1.print(cars);
    }
}
