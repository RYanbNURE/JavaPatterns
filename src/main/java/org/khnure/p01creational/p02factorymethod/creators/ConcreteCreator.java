package com.epam.p01creational.p02factorymethod.creators;

import com.epam.p01creational.p02factorymethod.models.Book;
import com.epam.p01creational.p02factorymethod.models.Laptop;
import com.epam.p01creational.p02factorymethod.models.Product;

// Конкретна реалізація Creatorа.
public class ConcreteCreator extends Creator {

    @Override
    public Product createProduct(String type) {
        switch (type) {
            case "Book":
                return new Book(); // Створюємо книгу.
            case "Laptop":
                return new Laptop(); // Створюємо ноутбук.
            default:
                throw new IllegalArgumentException("Unknown product type"); // Помилка при невідомому типі.
        }
    }
}
