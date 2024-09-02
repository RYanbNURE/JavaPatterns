package com.epam.p02structural.interpreter.expressions;

// Термінальний вираз для окремого слова
public class TerminalExpression implements Expression {
    private final String data;

    public TerminalExpression(String data) {
        this.data = data; // Зберігаємо слово, до якого відноситься цей вираз
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data); // Повертає true, якщо дане слово є в контексті
    }
}
