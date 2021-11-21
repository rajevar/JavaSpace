package com.desgnpatterns.decorator.playground;

public class ModelX extends Tesla {

    ModelX() {
        this.modelDesc = "Model X";
    }

    @Override
    protected int cost() {
        return 100000;
    }

    @Override
    protected String getDescription() {
        return this.modelDesc;
    }
}
