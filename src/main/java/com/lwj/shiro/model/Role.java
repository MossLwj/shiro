package com.lwj.shiro.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By lwj
 * 2018/2/3 0003 21:16
 */
@Data
public class Role {

    private Integer rid;

    private String rname;

    private Set<Permission> permissions = new HashSet<>();

    private Set<User> users = new HashSet<>();

}
