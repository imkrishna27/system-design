package org.example.design_patterns.structural_patterns.composite_design_pattern.implement_calculator;

public class ImplementCalculatorMain {
    public static void main(String[] args) {
        Number number1 = new Number(1);
        Number number2 = new Number(3);
        Number number3 = new Number(5);

        Expression expression1 = new InnerExpression(number1,number2,"ADD");
        Expression expression2 = new InnerExpression(expression1, number3, "MUL");
        Expression expression = new InnerExpression(expression2, expression1, "DIV");
        expression.evaluate();

    }
}
