package org.khnure.p02structural.flyweight;

import org.khnure.p02structural.flyweight.models.Shape;

// Основний клас для демонстрації патерну Flyweight
public class FlyweightDemo {
    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle("червоний");
        redCircle.draw(100, 100);

        Shape blueCircle = ShapeFactory.getCircle("синій");
        blueCircle.draw(200, 100);

        Shape redCircle2 = ShapeFactory.getCircle("червоний");
        redCircle2.draw(150, 150); // Це коло використовує той самий об'єкт, що й перше червоне коло

        System.out.println("Ідентичні сутності червоного кола? " + (redCircle == redCircle2)); // Перевірка, що два червоні кола - один і той самий об'єкт
    }
}
