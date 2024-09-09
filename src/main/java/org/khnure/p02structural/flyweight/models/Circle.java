package org.khnure.p02structural.flyweight.models;

// Конкретна імплементація Flyweight (Коло)
public class Circle implements Shape {
    private final String color;  // Колір кола, спільний стан

    // Конструктор
    public Circle(String color) {
        this.color = color;
        System.out.println("Створення кола кольору: " + color); // Сповіщення про створення кола
    }

    @Override
    public void draw(int x, int y) {
        // Вивід координат і кольору
        System.out.println("Коло кольору " + color + " намальоване на координатах: (" + x + "," + y + ")");
    }
}
