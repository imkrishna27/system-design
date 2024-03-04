package org.example.design_patterns.command_design_pattern.air_conditioner_implementation.impl;

import org.example.design_patterns.command_design_pattern.air_conditioner_implementation.AirConditioner;
import org.example.design_patterns.command_design_pattern.air_conditioner_implementation.Command;

public class TurnOnAcCommand implements Command {
    private AirConditioner airConditioner;

    public TurnOnAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        this.airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        this.airConditioner.turnOffAc();
    }
}
