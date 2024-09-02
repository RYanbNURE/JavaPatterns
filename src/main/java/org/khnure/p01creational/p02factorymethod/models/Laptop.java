package com.epam.p01creational.p02factorymethod.models;

// Конкретний продукт - ноутбук.
public class Laptop extends Product {

    @Override
    public void use() {
        System.out.println("Використовуємо ноутбук."); // Реалізація методу користування продуктом.
    }
}
