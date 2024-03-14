package org.example.design_patterns.creational_patterns.sigleton_design_pattern;

import java.util.function.Predicate;

public class Student {
    private String studentName;
    private static Student student;

    // make constructor private
    private Student() {

    }

    public static synchronized Student getInstance() {
        if (student == null) {
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }
}
