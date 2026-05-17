package projects.hk.design_patterns_interview.design_splitwise.factory;

import projects.hk.design_patterns_interview.design_splitwise.model.SplitData;

import java.util.List;

public interface SplitAmount {
    List<SplitData> calculate();
}
