package com.lambda.factory;

public class Car {
    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
