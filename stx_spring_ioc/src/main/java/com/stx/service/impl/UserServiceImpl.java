package com.stx.service.impl;

import com.stx.dao.UserDao;
import com.stx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
//--------------------------------------------1
    /*
    * 依赖注入：set方法注入。
    * 1、定义一个，类对象类型。
    * 2、创建他的set方法。来注入对象。
    * （userDao对象是Spring容器对象已经创建好了，通过set方法注入到这个Service类里面。）
    * */
/*    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
//---------------------------------------------1
//---------------------------------------------2
    /*
    * 依赖注入：有参构造函数注入。
    * */
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
//无参构造
    public UserServiceImpl() {
    }

    //    -----------------------------------------2
    @Override
    public void save() {
 /*       ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao =(UserDao) applicationContext.getBean("userDao");
       */
//        依赖注入降低了耦合度，就不用注释这部分这么麻烦了。
        userDao.save();
    }
}
