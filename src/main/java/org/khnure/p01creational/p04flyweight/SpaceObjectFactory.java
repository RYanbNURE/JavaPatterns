package com.epam.p01creational.p04flyweight;

public class SpaceObjectFactory {
    private static java.util.Map<String, SpaceObjectFlyweight> spaceObjects = new
            java.util.HashMap<>();

    public static SpaceObjectFlyweight getSpaceObject(String name) {
        if (!spaceObjects.containsKey(name)) {
            spaceObjects.put(name, new SpaceObjectFlyweight(name)); // Створення нового об'єкта, якщо він ще не існує
        }
        return spaceObjects.get(name);
    }
}
