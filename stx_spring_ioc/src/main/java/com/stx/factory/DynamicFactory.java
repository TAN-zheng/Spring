package com.stx.factory;

import com.stx.dao.UserDao;
import com.stx.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public  UserDao setUserDao(){
        return new UserDaoImpl();
    }
}
