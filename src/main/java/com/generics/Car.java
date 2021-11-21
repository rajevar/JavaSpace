package com.generics;

public class Car implements Vehicle {
    private String name;
    public Car(String name) {
        this.name = name;
    }
    public void start() {
        System.out.println("--start--");
    }
    public void stop() {
        System.out.println("--stop--");
    }
    public String toString() {
        return this.name;
    }
}
