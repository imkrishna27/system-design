package org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game;

import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game.Robot;
import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game.RobotFactory;

import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();
        IntStream.range(1,10).forEach(value -> {
            Robot humanRobot = robotFactory.createRobot("HUMAN_ROBOT");
            Robot dogRobot = robotFactory.createRobot("DOG_ROBOT");
            humanRobot.display(value+10,value+20);
            dogRobot.display(value+20,value+10);
        });
    }
}
