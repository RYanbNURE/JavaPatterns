package org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.hitech;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Chair;

public class HiTechChair extends Chair {

    @Override
    public void addToCatalog(){
        System.out.println("Chair added");
    }
}
