package org.example.design_patterns.behavioual_patterns.memento_design_pattern.configurarion_storage_implementation;

import java.util.Stack;

public class ConfigurationCareTaker {
    Stack<ConfigurationMemento> configurationMementoStack = new Stack<>();
    public void addMemento(ConfigurationMemento configurationMemento) {
        configurationMementoStack.add(configurationMemento);
    }

    public ConfigurationMemento undo() {
        if(!configurationMementoStack.isEmpty()) {
            configurationMementoStack.pop();
            if(configurationMementoStack.isEmpty()) {
                System.out.println("No history available");
                return null;
            }
            return configurationMementoStack.peek();
        }
        else {
            System.out.println("No history available");
            return null;
        }
    }
}
