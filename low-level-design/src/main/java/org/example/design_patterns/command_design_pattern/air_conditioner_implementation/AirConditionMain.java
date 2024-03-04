package org.example.design_patterns.command_design_pattern.air_conditioner_implementation;

import org.example.design_patterns.command_design_pattern.air_conditioner_implementation.impl.TurnOffAcCommand;
import org.example.design_patterns.command_design_pattern.air_conditioner_implementation.impl.TurnOnAcCommand;

public class AirConditionMain {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnOffAcCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
