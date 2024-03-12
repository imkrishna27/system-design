package org.example.design_patterns.structural_patterns.composite_design_pattern.implement_calculator;

public class InnerExpression implements Expression{
    Expression expression1;
    Expression expression2;
    String operation;

    InnerExpression(Expression expression1, Expression expression2, String operation) {
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int ans=0;
        switch (operation) {
            case "ADD":
                ans =this.expression1.evaluate()+this.expression2.evaluate();
                break;
            case "SUB":
                ans = this.expression1.evaluate()-this.expression2.evaluate();
                break;
            case "MUL":
                ans = this.expression1.evaluate()*this.expression2.evaluate();
                break;
            case "DIV":
                ans = this.expression1.evaluate()/this.expression2.evaluate();
                break;

        }
        System.out.println("Answer of expression is " + ans);
        return ans;
    }
}
