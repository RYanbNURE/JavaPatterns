package org.khnure.p02structural.flyweight;

import org.khnure.p02structural.flyweight.models.Circle;
import org.khnure.p02structural.flyweight.models.Shape;

import java.util.HashMap;
import java.util.Map;

// Фабрика для створення і кешування об'єктів Flyweight (Shape)
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    // Метод отримання кола заданого кольору (створює нове коло, якщо його ще немає)
    public static Shape getCircle(String color) {
        Shape circle = shapes.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapes.put(color, circle);
        }
        return circle;
    }
}
