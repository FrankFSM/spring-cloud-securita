package com.ralpa.use.db.mapper;

import com.ralpa.use.db.domain.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ralap on 2017/11/9.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    UserModel getUserByName(String name);
}
