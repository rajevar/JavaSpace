package com.desgnpatterns.decorator.playground;


public class CarDecor extends Vehicle {
    Vehicle v;
    CarDecor(Vehicle car) {
        this.v = car;
    }
    @Override
    public void type() {
        System.out.println(" -- CarDecor ---");
        this.v.type += ", Some Decor";
    }
}
