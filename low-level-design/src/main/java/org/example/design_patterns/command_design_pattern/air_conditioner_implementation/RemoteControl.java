package org.example.design_patterns.command_design_pattern.air_conditioner_implementation;

import java.util.Stack;

public class RemoteControl {
    Stack<Command> commandStack = new Stack<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        this.command.execute();
        this.commandStack.add(this.command);
    }

    public void undo() {
        if(!commandStack.isEmpty()) {
            this.command = this.commandStack.pop();
            this.command.undo();
        } else {
            System.out.println("No previous command found");
        }

    }
}
