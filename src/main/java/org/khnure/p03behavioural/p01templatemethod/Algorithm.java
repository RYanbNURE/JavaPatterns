package org.khnure.p03behavioural.p01templatemethod;

public abstract class Algorithm {
    // Шаблонний метод, який реалізує основну логіку алгоритму
    public void execute() {
        stepOne();
        stepTwo();
        if (isAdditionalStepNeeded()) {
            additionalStep();
        }
//        if (pdf) {
//            ....
//        }
//        if (excel) {
//            ...
//        }
        stepThree();
    }

    protected void stepOne() {
        System.out.println("Concrete step");
    }

    // Абстрактний метод, який має бути реалізований у підкласах для другого кроку
    protected abstract void stepTwo();

    // Неабстрактний метод, що може бути перевизначений у підкласах (опціонально)
    protected boolean isAdditionalStepNeeded() {
        return false;
    }

    // Абстрактний метод, який має бути реалізований у підкласах для додаткового кроку (опціонально)
    protected abstract void additionalStep();

    // Абстрактний метод, який має бути реалізований у підкласах для третього кроку
    protected void stepThree() {
        System.out.println("Надіслати сповіщення");
    };
}
