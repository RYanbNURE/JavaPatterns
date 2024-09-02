package com.epam.p01creational.p02factorymethod.models;

/**
 * Паттерн Factory Method уособлює логіку створення об'єктів від їх клієнтів завдяки створенню методу,
 * який служить фабрикою для створення об'єктів.
 */

// Абстрактний клас Product, який визначає інтерфейс продуктів.
public abstract class Product {
    public abstract void use(); // Абстрактний метод користування продуктом.

}
