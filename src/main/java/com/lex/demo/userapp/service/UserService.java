package com.lex.demo.userapp.service;

import com.lex.demo.userapp.model.Role;
import com.lex.demo.userapp.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String email, String roleName);
    User getUser(String email);
    List<User> getUsers();

}
