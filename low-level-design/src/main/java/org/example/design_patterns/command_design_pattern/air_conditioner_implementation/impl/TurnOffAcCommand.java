package org.example.design_patterns.command_design_pattern.air_conditioner_implementation.impl;

import org.example.design_patterns.command_design_pattern.air_conditioner_implementation.AirConditioner;
import org.example.design_patterns.command_design_pattern.air_conditioner_implementation.Command;

public class TurnOffAcCommand implements Command {
    private AirConditioner airConditioner;
    public TurnOffAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
