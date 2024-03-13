package org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game;

import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game.impl.DogRobot;
import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_robot_game.impl.HumanRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String,Robot> robotCache = new HashMap<>();

    public Robot createRobot(String robotType) {
        // cache implementation to reduce space
        if(robotCache.containsKey(robotType)) {
            return robotCache.get(robotType);
        }

        if(robotType=="HUMAN_ROBOT")
        {
            Robot humanRobot = new HumanRobot(robotType, "ROBOT_BODY");
            robotCache.put(robotType,humanRobot);
            return humanRobot;

        } else if (robotType=="DOG_ROBOT") {
            Robot dogRobot = new DogRobot(robotType, "ROBOT_BODY");
            robotCache.put(robotType,dogRobot);
            return dogRobot;
        }
        return null;
    }
}
