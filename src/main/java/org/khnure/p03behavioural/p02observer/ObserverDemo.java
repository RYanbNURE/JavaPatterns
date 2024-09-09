package org.khnure.p03behavioural.p02observer;

// Головний клас для тестування шаблону спостерігача
public class ObserverDemo {
    public static void main(String[] args) {
        // Створення суб'єкта
        ConcreteSubject subject = new ConcreteSubject();

        // Створення та додавання спостерігачів
        Observer observer1 = new ConcreteObserver("Спостерігач 1");
        Observer observer2 = new ConcreteObserver("Спостерігач 2");
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Виклик бізнес-логіки у суб'єкті, яка оновить спостерігачів
        subject.someBusinessLogic();
    }
}
