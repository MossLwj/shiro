package com.lwj.shiro.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By lwj
 * 2018/2/3 0003 21:15
 */
@Data
public class User {

    private Integer uid;

    private String username;

    private String password;

    private Set<Role> roles = new HashSet<>();
}
