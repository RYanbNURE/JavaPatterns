package com.epam.p03behavioural.p02observer;

// Конкретний спостерігач, який реагує на оновлення статусу
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " отримав повідомлення: " + message);
    }
}
