package org.khnure.p01creational.p02factorymethod.creators.alternative;

import org.khnure.p01creational.p02factorymethod.models.alternative.Transport;

public abstract class Logistic {

    public void deliver(Type type) {
        startProcess();
        Transport transport = createTransport(type);
        transport.changePlaceFromAtoB();
        reportDeliveryStatus();
    }

    private void startProcess() {
        System.out.println("Start process");
    }

    private void reportDeliveryStatus() {
        System.out.println("Delivery status");
    }

    public abstract Transport createTransport(Type type);
}
