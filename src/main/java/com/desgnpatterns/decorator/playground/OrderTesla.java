package com.desgnpatterns.decorator.playground;

public class OrderTesla {
    public static void main(String[] args) {
        Tesla modelX = new ModelX();
        System.out.println(modelX.getDescription() + " | Costs: " + modelX.cost());
        modelX = new InteriorDecorator(modelX);
        System.out.println(modelX.getDescription() + " | Costs: " + modelX.cost());
    }
}
