package com.desgnpatterns.decorator;

public class PaperWrapper extends FlowerBouquet { // replace FlowerBouquetDecorator with FlowerBouquet : still works
    FlowerBouquet flowerBouquet;
    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet=flowerBouquet;
    }
    public  String getDescription() {
        System.out.println(" paper wrap desc");
        return flowerBouquet.getDescription()+", paper wrap";
    }
    public double cost() {
        return flowerBouquet.cost() + 3;
    }
}