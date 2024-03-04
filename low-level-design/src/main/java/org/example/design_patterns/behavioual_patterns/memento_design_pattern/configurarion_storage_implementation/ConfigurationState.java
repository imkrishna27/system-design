package org.example.design_patterns.behavioual_patterns.memento_design_pattern.configurarion_storage_implementation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationState {
    public String dbName;
    public String dbUrl;
    public String dbDriver;
    public String dbPassword;
}
