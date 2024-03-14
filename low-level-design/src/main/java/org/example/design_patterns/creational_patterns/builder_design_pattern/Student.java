package org.example.design_patterns.creational_patterns.builder_design_pattern;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Student {
    public String name;
    public String enrollmentId;

    public String country;

    public int courseId;

    public Student(StudentBuilder builder) {
        this.country = builder.country;
        this.enrollmentId= builder.enrollmentId;
        this.name = builder.name;
        this.courseId = builder.courseId;
    }
}
