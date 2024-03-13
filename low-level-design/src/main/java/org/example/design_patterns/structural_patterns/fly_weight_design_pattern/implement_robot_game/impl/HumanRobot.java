package org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game.impl;

import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game.Robot;

public class HumanRobot implements Robot {
    private String type; // intrinsic data
    private String body; // intrinsic data

    // make intrinsic data immutable
    public String getType() {
        return type;
    }

    public String getBody() {
        return body;
    }

    public HumanRobot(String type,String body) {
        this.type = type;
        this.body = body;
    }
    @Override
    public void display(int x, int y) {
        // use these coordinate to display
        System.out.println("display human robot " + x + " "+ y );
    }
}
