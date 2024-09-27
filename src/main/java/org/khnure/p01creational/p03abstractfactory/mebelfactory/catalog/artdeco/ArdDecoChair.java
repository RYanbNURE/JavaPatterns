package org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.artdeco;

import org.khnure.p01creational.p03abstractfactory.mebelfactory.catalog.Chair;

public class ArdDecoChair extends Chair {

    @Override
    public void addToCatalog(){
        System.out.println(" ArdDeco Chair added");
    }
}
