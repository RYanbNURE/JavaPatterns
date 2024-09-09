package org.khnure.p01creational.p02factorymethod.creators.alternative;

import org.khnure.p01creational.p02factorymethod.models.alternative.FastAirplane;
import org.khnure.p01creational.p02factorymethod.models.alternative.SlowAirplane;
import org.khnure.p01creational.p02factorymethod.models.alternative.Transport;

public class AirLogistic extends Logistic {

    @Override
    public Transport createTransport(Type type) {
        switch (type) {
            case FAST:
                return new FastAirplane();
            case SLOW:
                return new SlowAirplane();
        }
        throw new IllegalArgumentException();
    }
}
