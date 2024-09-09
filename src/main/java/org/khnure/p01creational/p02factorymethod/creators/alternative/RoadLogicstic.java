package org.khnure.p01creational.p02factorymethod.creators.alternative;

import org.khnure.p01creational.p02factorymethod.models.Book;
import org.khnure.p01creational.p02factorymethod.models.Laptop;
import org.khnure.p01creational.p02factorymethod.models.Product;
import org.khnure.p01creational.p02factorymethod.models.alternative.*;

public class RoadLogicstic extends Logistic {

    @Override
    public Transport createTransport(Type type) {
        return switch (type) {
            case FAST -> new Truck();
            case SLOW -> new Deer();
        };
    }
}
