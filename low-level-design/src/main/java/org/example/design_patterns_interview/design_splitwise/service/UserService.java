package org.example.design_patterns_interview.design_splitwise.service;

import org.example.design_patterns_interview.design_splitwise.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    List<User> userList;
    public UserService() {
        this.userList = new ArrayList<>();
    }
    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getUser(long userId){
     return userList.stream().filter(user -> user.getUserId()==userId).findFirst().orElse(null);
    }

    public List<User> getAllUsers() {
        return this.userList;
    }

    public List<User> getAllUsersExpect(long id) {
        return this.userList.stream().filter(user -> user.getUserId()!=id).collect(Collectors.toList());
    }

}
