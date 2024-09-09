package org.khnure.p01creational.p02factorymethod.creators;

import org.khnure.p01creational.p02factorymethod.models.Product;

// Клієнт використовує Factory для створення об'єктів.
public abstract class Creator {
    public abstract Product createProduct(String type); // Фабричний метод.

}
