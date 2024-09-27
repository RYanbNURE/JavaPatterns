package org.khnure.p01creational.p03abstractfactory.mebelfactory.factory;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Chair;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Item;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Sofa;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Table;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.artdeco.ArdDecoChair;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.artdeco.ArtDecoSofa;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.artdeco.ArtDecoTable;

public class ArtdecoFactory extends AbstractFactory {

    @Override
    public Chair produceChair() {
        return new ArdDecoChair();
    }

    @Override
    public Sofa produceSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table produceTable() {
        return new ArtDecoTable();
    }
}
