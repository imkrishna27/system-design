package org.example.design_patterns.behavioual_patterns.interpretor_design_pattern.evaluate_expression;

public class EvaluateNumberTerminalExpression implements Expression{
    Character val;

    EvaluateNumberTerminalExpression(Character val) {
        this.val= val;
    }
    @Override
    public int interpret(Context context) {
        return context.getValue(this.val);
    }
}
