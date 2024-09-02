package com.epam.p03behavioural.p01templatemethod;

// Інший підклас, що реалізує алгоритм
public class ConcreteAlgorithm2 extends Algorithm {
    @Override
    protected void stepOne() {
        // Логіка першого кроку для ConcreteAlgorithm2
        System.out.println("Виконується перший крок для ConcreteAlgorithm2");
    }

    @Override
    protected void stepTwo() {
        // Логіка другого кроку для ConcreteAlgorithm2
        System.out.println("Виконується другий крок для ConcreteAlgorithm2");
    }

    @Override
    protected void additionalStep() {
        // Логіка додаткового кроку для ConcreteAlgorithm1 (необов'язково)
        System.out.println("Виконується додатковий крок для ConcreteAlgorithm2");
    }

    @Override
    protected void stepThree() {
        // Логіка третього кроку для ConcreteAlgorithm2
        System.out.println("Виконується третій крок для ConcreteAlgorithm2");
    }
}
