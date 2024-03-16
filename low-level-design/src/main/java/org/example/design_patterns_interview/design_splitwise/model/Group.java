package org.example.design_patterns_interview.design_splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    long groupId;
    String groupName;
    List<User> totalGroupUsers;
    List<Expense> expenseList;
}
