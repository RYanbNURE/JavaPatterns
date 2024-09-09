package org.khnure.p01creational.p02factorymethod.models.alternative;

public class Deer extends Transport {
    @Override
    public void changePlaceFromAtoB() {
        System.out.println("On road by deer");
    }
}
