package org.example.design_patterns_interview.design_splitwise.factory;

import org.example.design_patterns_interview.design_splitwise.model.SplitData;

import java.util.List;

public interface SplitAmount {
    List<SplitData> calculate();
}
