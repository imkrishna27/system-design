package projects.hk.design_patterns.creational_patterns.sigleton_design_pattern;

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
