package org.khnure.p03behavioural.p01templatemethod;

// Інший підклас, що реалізує алгоритм
public class ConcreteAlgorithm3 extends Algorithm {


    @Override
    protected void stepTwo() {
        // Логіка другого кроку для ConcreteAlgorithm3
        System.out.println("Виконується другий крок для ConcreteAlgorithm3");
    }

    @Override
    protected void additionalStep() {
        // Логіка додаткового кроку для ConcreteAlgorithm1 (необов'язково)
        System.out.println("Виконується додатковий крок для ConcreteAlgorithm3");
    }
}
