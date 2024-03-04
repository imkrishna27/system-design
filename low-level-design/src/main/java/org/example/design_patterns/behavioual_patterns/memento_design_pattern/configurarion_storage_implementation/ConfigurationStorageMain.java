package org.example.design_patterns.behavioual_patterns.memento_design_pattern.configurarion_storage_implementation;

import lombok.ToString;

@ToString
public class ConfigurationStorageMain {
    public static void main(String[] args) {
        // maintains history
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();
        // our state object that will take care of all the data
        ConfigurationState configurationState = new ConfigurationState(
                "testDbName",
                "testDbUrl",
                "testDbDriver",
                "testDbPass"
        );
        // our originator clas that will create our memento
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(configurationState);
        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
        // add it to history
        configurationCareTaker.addMemento(snapshot1);

        // now let's modify our originator
        configurationOriginator.setConfigurationState(new ConfigurationState(
                "prodDbName",
                "prodDbUrl",
                "prodDbDriver",
                "prodDbPass"
        ));
        // create memento
        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
        // add it to history
        configurationCareTaker.addMemento(snapshot2);

        // now lets see our originator state
        System.out.println("State: " + configurationOriginator.getConfigurationState());

        // 1st UNDO
        configurationOriginator.restoreMemento(configurationCareTaker.undo());

        // now we can see state
        System.out.println("State: " + configurationOriginator.getConfigurationState());

        // 2nd UNDO
        configurationOriginator.restoreMemento(configurationCareTaker.undo());

        // now we can see state
        System.out.println("State: " + configurationOriginator.getConfigurationState());



    }
}
