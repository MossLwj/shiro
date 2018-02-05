package com.lwj.shiro.mapper;

import com.lwj.shiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created By lwj
 * 2018/2/3 0003 21:23
 */
public interface UserMapper {

    User findByUsername(@Param("username") String username);

}
