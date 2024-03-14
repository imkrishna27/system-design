package org.example.design_patterns.creational_patterns.prototype_design_pattern;

import lombok.ToString;

@ToString
public class Client {
    public static void main(String[] args) {
        Student hari = new Student("hari");
        Prototype clone = hari.clone();
        System.out.println(clone);
    }
}
