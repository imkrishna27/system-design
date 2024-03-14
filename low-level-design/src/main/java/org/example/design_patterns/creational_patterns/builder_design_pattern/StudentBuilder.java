package org.example.design_patterns.creational_patterns.builder_design_pattern;

public class StudentBuilder {
    public String name;
    public String enrollmentId;

    public String country;

    public int courseId;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    public StudentBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public StudentBuilder setCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
