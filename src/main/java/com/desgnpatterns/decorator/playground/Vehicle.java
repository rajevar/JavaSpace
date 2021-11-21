package com.desgnpatterns.decorator.playground;

public abstract class  Vehicle {

    public String type;
    public abstract void type();
    public void show() {
        System.out.println(" Veh Type > " + this.type);
    }
}
