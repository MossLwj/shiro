package com.lwj.shiro.service;

import com.lwj.shiro.model.User;

/**
 * Created By lwj
 * 2018/2/3 0003 21:25
 */
public interface UserService {

    User findByUsername(String username);
}
