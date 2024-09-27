package org.khnure.p01creational.p03abstractfactory.mebelfactory.factory;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Chair;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Item;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Sofa;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Table;

public abstract class AbstractFactory {

    public abstract Chair produceChair();
    public abstract Sofa produceSofa();
    public abstract Table produceTable();

    public Item produceItem(String type) {
        System.out.println("New " + type + " started created");
        if ("Sofa".equals(type)) {
            System.out.println("New " + type + " started created");
            return produceSofa();
        } else if ("Chair".equals(type)) {
            System.out.println("New " + type + " started created");
            return produceChair();
        } else if ("Table".equals(type)) {
            System.out.println("New " + type + " started created");
            return produceTable();
        }
        throw new RuntimeException("Type is not produced yet");
    }
}
