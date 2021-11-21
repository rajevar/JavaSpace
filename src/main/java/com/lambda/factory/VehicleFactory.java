package com.lambda.factory;

public class VehicleFactory {
    public static Vehicle<Car> purchase(String s) {
        return  () -> new Car(s);
    }

    public static void main(String[] args) {
        Car c2 = VehicleFactory.purchase("Audi").get();
        System.out.println(c2);
        Vehicle vehicle = VehicleFactory.purchase("tesla");
        Car c = (Car) vehicle.get();
        System.out.println(c);
    }
}
