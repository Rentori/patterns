package com.company.patterns.behavioral.interpreter;

public class AndExpression implements Expression {
    Expression firstExpression;
    Expression secondExpression;

    public AndExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) && secondExpression.interpret(context);
    }
}
