package com.lwj.shiro.service;

import com.lwj.shiro.mapper.UserMapper;
import com.lwj.shiro.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created By lwj
 * 2018/2/3 0003 21:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

}
