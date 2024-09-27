package org.khnure.p01creational.p03abstractfactory.mebelfactory.factory;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Chair;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Sofa;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Table;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.hitech.HiTechChair;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.hitech.HiTechSofa;
import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.hitech.HiTechTable;

public class HiTechFactory extends AbstractFactory {

    @Override
    public Chair produceChair() {
        return new HiTechChair();
    }

    @Override
    public Sofa produceSofa() {
        return new HiTechSofa();
    }

    @Override
    public Table produceTable() {
        return new HiTechTable();
    }
}
