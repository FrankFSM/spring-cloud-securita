package com.ralpa.use.db.domain;

import lombok.Data;

/**
 * Created by ralap on 2017/11/9.
 */
@Data
public class UserModel {

    private int id;
    private String name;
    private String password;
    private int age;
    private String address;
    private String roles;

}
