package org.khnure.p01creational.p03abstractfactory;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.factory.AbstractFactory;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.factory.ArtdecoFactory;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.factory.Factory;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Item;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.factory.HiTechFactory;

public class Main {
    public static void main(String[] args) {
//        new Sofa();
//        new Table();
//        new Chair();
        Factory kharkivFactory = new Factory();

        Item item = kharkivFactory.produceItem("Table");
        item.addToCatalog();

        AbstractFactory extendedFactory = new HiTechFactory();

        extendedFactory.produceTable();
        extendedFactory.produceSofa();
        extendedFactory.produceChair();

        extendedFactory.produceItem("Sofa");
    }
}
