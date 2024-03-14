package org.example.design_patterns.creational_patterns.sigleton_design_pattern;

public class Client {
    public static void main(String[] args) {
        Student instance = Student.getInstance();
        System.out.println(instance.hashCode());
        Student instance1 = Student.getInstance();
        System.out.println(instance1.hashCode());
    }
}
