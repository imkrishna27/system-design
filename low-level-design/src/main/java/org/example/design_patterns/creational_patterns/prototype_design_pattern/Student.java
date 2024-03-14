package org.example.design_patterns.creational_patterns.prototype_design_pattern;

import lombok.ToString;

@ToString
public class Student implements Prototype{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(name);
    }
}
