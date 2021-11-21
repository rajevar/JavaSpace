package com.desgnpatterns.decorator.playground;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car = new CarDecor(car);
        System.out.println(car.type);

    }
}
