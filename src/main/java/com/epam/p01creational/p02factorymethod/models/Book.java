package com.epam.p01creational.p02factorymethod.models;

// Конкретний продукт - книга.
public class Book extends Product {
    @Override
    public void use() {
        System.out.println("Читаємо книгу."); // Реалізація методу користування продуктом.
    }
}
