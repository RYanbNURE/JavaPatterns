package com.epam.p02structural.interpreter.expressions;

// Інтерфейс виразу - основа для всіх конкретних виразів
public interface Expression {
    boolean interpret(String context); // Метод інтерпретації
}
