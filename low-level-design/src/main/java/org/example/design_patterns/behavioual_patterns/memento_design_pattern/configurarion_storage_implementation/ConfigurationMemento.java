package org.example.design_patterns.behavioual_patterns.memento_design_pattern.configurarion_storage_implementation;

import lombok.Data;

@Data
public class ConfigurationMemento {
    ConfigurationState configurationState;
    ConfigurationMemento(ConfigurationState configurationState) {
        this.configurationState = configurationState;
    }
}
