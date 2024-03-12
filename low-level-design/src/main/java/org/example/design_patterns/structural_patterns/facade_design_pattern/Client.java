package org.example.design_patterns.structural_patterns.facade_design_pattern;

public class Client {
    public static void main(String[] args) {
        FacadeImpl facade = new FacadeImpl(new DriveCarImpl());
        facade.driveCar();
    }
}
