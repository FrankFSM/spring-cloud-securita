package com.ralpa.use.db.controller;

import com.ralpa.use.db.domain.UserModel;
import com.ralpa.use.db.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralap on 2017/11/9.
 */
@RestController
public class UserControllser {

    @GetMapping("/user")
    public UserModel getUser() {
        UserModel model = new UserModel();
        model.setName("user");
        model.setRoles("USER");
        return model;
    }

    @GetMapping("/admin")
    public UserModel getAmdin() {
        UserModel model = new UserModel();
        model.setName("admin");
        model.setRoles("ADMIN");
        return model;
    }


}
