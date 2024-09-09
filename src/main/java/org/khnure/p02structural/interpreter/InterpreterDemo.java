package org.khnure.p02structural.interpreter;

import org.khnure.p02structural.interpreter.expressions.AndExpression;
import org.khnure.p02structural.interpreter.expressions.Expression;
import org.khnure.p02structural.interpreter.expressions.TerminalExpression;

// Основний клас для демонстрації патерну Інтерпретатор
public class InterpreterDemo {
    // Метод створення правила граматики для інтерпретації
    public static Expression getMaleExpression() {
        Expression john = new TerminalExpression("John");
        Expression robert = new TerminalExpression("Robert");
        return new AndExpression(john, robert); // Логічне і між двома терміналами
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression(); // Правило для сприйняття

        System.out.println("John і Robert чоловіки? " + isMale.interpret("John Robert")); // Використання інтерпретатора
    }
}
