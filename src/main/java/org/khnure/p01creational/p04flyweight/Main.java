package org.khnure.p01creational.p04flyweight;

public class Main {
    public static void main(String[] args) {

        // Отримання або створення об'єкта "Земля"
        SpaceObjectFlyweight earth = SpaceObjectFactory.getSpaceObject("Земля");
        earth.display(10, 20);

        // Отримання або створення об'єкта "Місяць"
        SpaceObjectFlyweight moon = SpaceObjectFactory.getSpaceObject("Місяць");
        moon.display(30, 40);

        // Спроба отримати той самий об'єкт ще раз
        SpaceObjectFlyweight anotherEarth = SpaceObjectFactory.getSpaceObject("Земля");
        System.out.print("Чи це та ж сама Земля? ");
        if (earth == anotherEarth) {
            System.out.println("Так");
        } else {
            System.out.println("Ні");
        }
    }
}
