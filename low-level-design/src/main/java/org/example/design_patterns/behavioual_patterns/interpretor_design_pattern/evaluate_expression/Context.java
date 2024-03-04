package org.example.design_patterns.behavioual_patterns.interpretor_design_pattern.evaluate_expression;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<Character,Integer> characterIntegerMap = new HashMap<>();

    public void putValue(Map.Entry<Character,Integer> entry) {
        characterIntegerMap.put(entry.getKey(),entry.getValue());
    }

    public Integer getValue(Character ch) {
        return characterIntegerMap.get(ch);

    }
}
