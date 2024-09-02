package com.epam.p03behavioural.p01templatemethod;

// Підклас, що реалізує алгоритм
public class ConcreteAlgorithm1 extends Algorithm{

    @Override
    protected void stepOne() {
        // Логіка першого кроку для ConcreteAlgorithm1
        System.out.println("Виконується перший крок для ConcreteAlgorithm1");
    }

    @Override
    protected void stepTwo() {
        // Логіка другого кроку для ConcreteAlgorithm1
        System.out.println("Виконується другий крок для ConcreteAlgorithm1");
    }

    @Override
    protected void additionalStep() {
        // Логіка додаткового кроку для ConcreteAlgorithm1 (необов'язково)
        System.out.println("Виконується додатковий крок для ConcreteAlgorithm1");
    }

    @Override
    protected void stepThree() {
        // Логіка третього кроку для ConcreteAlgorithm1
        System.out.println("Виконується третій крок для ConcreteAlgorithm1");
    }
}
