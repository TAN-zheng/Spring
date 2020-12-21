package com.stx.dao.impl;

import com.stx.dao.UserDao;
import com.stx.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    private String userName;
    private int age;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl无参构造怎在创建。。");
    }

    public void save() {
//        System.out.println(userName+"===="+age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("UserDaoImpl save running ...");
    }
}
