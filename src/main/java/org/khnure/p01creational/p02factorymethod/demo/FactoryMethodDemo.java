package org.khnure.p01creational.p02factorymethod.demo;

import org.khnure.p01creational.p02factorymethod.creators.ConcreteCreator;
import org.khnure.p01creational.p02factorymethod.creators.Creator;
import org.khnure.p01creational.p02factorymethod.models.Product;

// Основний клас для демонстрації Factory Method.
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct("Book");
        product1.use();

        Product product2 = creator.createProduct("Laptop");
        product2.use();
    }
}
