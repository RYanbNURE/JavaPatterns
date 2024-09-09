package org.khnure.p02structural.interpreter.expressions;

// Нетермінальний вираз для логічного І (AND)
public class AndExpression implements Expression {
    private final Expression expr1;
    private final Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1; // Перший вираз
        this.expr2 = expr2; // Другий вираз
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context); // Відповідно до логіки І
    }
}
