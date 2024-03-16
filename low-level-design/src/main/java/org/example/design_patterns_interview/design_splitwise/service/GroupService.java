package org.example.design_patterns_interview.design_splitwise.service;

import org.example.design_patterns_interview.design_splitwise.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    List<Group> groupList;
    public GroupService() {
        this.groupList = new ArrayList<>();
    }

    public void addGroup(Group group) {
        this.groupList.add(group);
    }

    public Group getGroup(long groupId) {
        return this.groupList.stream().filter(group -> group.getGroupId()==groupId).findFirst().orElse(null);
    }

    public List<Group> getAllGroups() {
        return this.groupList;
    }
}
