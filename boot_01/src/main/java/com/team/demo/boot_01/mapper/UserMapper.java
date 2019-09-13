package com.team.demo.boot_01.mapper;


import com.team.demo.boot_01.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectByPrimarykey(Integer id);

    int updateByPrimarykey(User user);

    List<User> selectAllUser();


}
