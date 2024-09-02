package com.epam.p03behavioural.p02observer;

// Конкретний суб'єкт, який буде оновлювати своїх спостерігачів
public class ConcreteSubject extends Subject {
    public void someBusinessLogic() {
        // Логіка бізнес-процесу, що може змінити стан
        System.out.println("Виконується деяка бізнес-логіка...");
        notifyObservers("Статус оновлено!");
    }
}
