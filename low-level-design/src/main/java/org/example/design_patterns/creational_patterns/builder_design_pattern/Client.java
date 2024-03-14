package org.example.design_patterns.creational_patterns.builder_design_pattern;

import lombok.ToString;

@ToString
public class Client {
    public static void main(String[] args) {
        Student student = new StudentBuilder().setCourseId(1).setName("Hari").setCountry("India").build();
        System.out.println(student);
    }
}
