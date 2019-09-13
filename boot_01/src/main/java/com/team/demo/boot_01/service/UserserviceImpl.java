package com.team.demo.boot_01.service;

import com.team.demo.boot_01.mapper.UserMapper;
import com.team.demo.boot_01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        System.out.println("S -->");
        List<User> users = userMapper.selectAllUser();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).toString());
        }
        return users;
    }

    @Transactional
    @Override
    public Integer updateUser(){
        User user = new User();
        user.setUserId("001");
        user.setUserName("大圣");
        int i = userMapper.updateByPrimarykey(user);
        System.out.println("更新：" + i);

        int a = 10/0;

        return i;
    }

}
