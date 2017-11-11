package com.ralpa.use.db.service;

import com.ralpa.use.db.domain.UserModel;
import com.ralpa.use.db.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ralap on 2017/11/9.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserModel getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
