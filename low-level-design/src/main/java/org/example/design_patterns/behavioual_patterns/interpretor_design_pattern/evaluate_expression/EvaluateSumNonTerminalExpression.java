package org.example.design_patterns.behavioual_patterns.interpretor_design_pattern.evaluate_expression;

public class EvaluateSumNonTerminalExpression implements Expression{
    Expression expression1;
    Expression expression2;

    EvaluateSumNonTerminalExpression(Expression expression1,Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    @Override
    public int interpret(Context context) {
        return expression1.interpret(context)+expression2.interpret(context);
    }
}
