package org.khnure.p01creational.p02factorymethod.models.alternative;

public class Truck extends Transport {
    @Override
    public void changePlaceFromAtoB() {
        System.out.println("On road by truck");
    }
}
