package com.desgnpatterns.decorator.playground;

public class InteriorDecorator extends Tesla {
    Tesla tesla;

    public InteriorDecorator(Tesla tesla) {
        this.tesla = tesla;
    }

    @Override
    public String getDescription() {
        return this.tesla.getDescription() + ", Interior decor";
    }

    @Override
    protected int cost() {
        return this.tesla.cost() + 5000;
    }
}
