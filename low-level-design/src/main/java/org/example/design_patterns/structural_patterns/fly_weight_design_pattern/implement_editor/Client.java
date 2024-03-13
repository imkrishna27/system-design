package org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_editor;

public class Client {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Letter letter = documentFactory.createLetter('a');
        letter.display(1,1);
        Letter letter2 = documentFactory.createLetter('a');
        letter.display(1,2);
    }
}
