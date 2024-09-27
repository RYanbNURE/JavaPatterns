package org.khnure.p01creational.p03abstractfactory.mebelfactory.factory;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Item;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Sofa;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Table;

public class Factory {

    public Item produceItem(String type) {
        System.out.println("New " + type + " started created");
        if ("Sofa".equals(type)) {
            System.out.println("New " + type + " started created");
            return new Sofa();
        } else if ("Chair".equals(type)) {
            System.out.println("New " + type + " started created");
//            return new Chair();
        } else if ("Table".equals(type)) {
            System.out.println("New " + type + " started created");
            return new Table();
        }
        throw new RuntimeException("Type is not produced yet");
    }
}
