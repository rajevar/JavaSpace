package com.desgnpatterns.decorator.playground;

public class Car extends Vehicle {
    Car() {
        this.type = "CAR";
    }
    @Override
    public void type() {
        System.out.println(" -- Car ---");
    }
}
