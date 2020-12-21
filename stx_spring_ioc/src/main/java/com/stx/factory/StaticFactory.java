package com.stx.factory;

import com.stx.dao.UserDao;
import com.stx.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao setUserDao(){
        return new UserDaoImpl();
    }
}
