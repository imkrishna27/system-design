package org.example.design_patterns.behavioual_patterns.memento_design_pattern.configurarion_storage_implementation;

import lombok.Data;

@Data
public class ConfigurationOriginator {

    ConfigurationState configurationState;
    ConfigurationOriginator(ConfigurationState configurationState) {
        this.configurationState = configurationState;
    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(configurationState);
    }

    public ConfigurationState restoreMemento(ConfigurationMemento configurationMemento) {
        this.configurationState = configurationMemento.getConfigurationState();
        return this.configurationState;
    }

}
