package com.stx.demo;

import com.stx.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao =(UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}
