package org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_editor;

import org.example.design_patterns.structural_patterns.fly_weight_design_pattern.implement_editor.impl.DocumentLetter;

import java.util.HashMap;
import java.util.Map;

public class DocumentFactory {
    Map<Character,Letter> cache = new HashMap<>();

    public Letter createLetter(Character character) {

        if(cache.containsKey(character)) {
            return cache.get(character);
        }
        else {
            DocumentLetter documentLetter = new DocumentLetter("Arial", 10, character);
            cache.put(character,documentLetter);
            return documentLetter;
        }
    }
}
