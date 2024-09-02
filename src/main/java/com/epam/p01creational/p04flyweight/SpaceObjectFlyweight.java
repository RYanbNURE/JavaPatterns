package com.epam.p01creational.p04flyweight;

public class SpaceObjectFlyweight {
    private String name; // Ім'я космічного об'єкта

    public SpaceObjectFlyweight(String name) {
        this.name = name;
    }

    public void display(int x, int y) {
        System.out.println("Відображення " + name + " на позиції (" + x + ", " + y + ")");
    }
}
