package com.company.patterns.behavioral.interpreter;

public class OrExpression implements Expression {
    Expression firstExpression;
    Expression secondExpression;

    public OrExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}
