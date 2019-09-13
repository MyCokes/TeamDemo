package com.team.demo.boot_01.service;


import com.team.demo.boot_01.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    Integer updateUser();
}
