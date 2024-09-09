package org.khnure.p03behavioural.p01templatemethod.abstractdemo;

public abstract class Milkfeeding extends Animal {

    @Override
    public void getBorn() {
        System.out.println("Get born alive");
    }

    public void feedWithMilk() {
        System.out.println("Feed babies with milk");
    }
}
