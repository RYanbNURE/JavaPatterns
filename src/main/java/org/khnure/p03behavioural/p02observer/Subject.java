package org.khnure.p03behavioural.p02observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    // Метод для додавання спостерігача
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для видалення спостерігача
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод для повідомлення всім спостерігачам
    protected void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
