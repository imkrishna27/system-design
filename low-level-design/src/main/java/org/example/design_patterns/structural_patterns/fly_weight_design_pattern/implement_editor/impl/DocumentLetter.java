package org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_editor.impl;

import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_editor.Letter;

public class DocumentLetter implements Letter {
    private String fontType; // intrinsic data
    private Integer fontSize; // intrinsic data
    private Character character; // intrinsic data

    public DocumentLetter(String fontType, Integer fontSize, Character character) {
        this.fontType = fontType;
        this.fontSize = fontSize;
        this.character = character;
    }

    // getters for immutable intrinsic data
    public String getFontType() {
        return fontType;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public void display(int row, int column) {
        System.out.println("display at row: "+ row + " and column: "+ column);
    }
}
