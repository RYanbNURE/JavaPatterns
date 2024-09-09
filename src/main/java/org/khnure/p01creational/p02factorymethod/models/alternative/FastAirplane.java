package org.khnure.p01creational.p02factorymethod.models.alternative;

public class FastAirplane extends Transport {
    @Override
    public void changePlaceFromAtoB() {
        System.out.println("By air");
    }
}
