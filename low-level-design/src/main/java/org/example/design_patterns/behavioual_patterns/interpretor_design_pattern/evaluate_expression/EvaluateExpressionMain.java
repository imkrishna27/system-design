package org.example.design_patterns.behavioual_patterns.interpretor_design_pattern.evaluate_expression;

import java.util.HashMap;
import java.util.Map;

public class EvaluateExpressionMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.putValue(Map.entry('A',2));
        context.putValue(Map.entry('B',9));
        context.putValue(Map.entry('C',1));
        context.putValue(Map.entry('D',2));
        context.putValue(Map.entry('E',1));
        context.putValue(Map.entry('F',2));
        // created a expression
        Expression expression = new EvaluateSumNonTerminalExpression(
                new EvaluateMultiplyNonTerminalExpression(new EvaluateNumberTerminalExpression('A'), new EvaluateNumberTerminalExpression('B')),
                new EvaluateMultiplyNonTerminalExpression(new EvaluateNumberTerminalExpression('D'), new EvaluateNumberTerminalExpression('F'))
        );
        System.out.println(expression.interpret(context));
    }
}
