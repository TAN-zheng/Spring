package com.stx.test;

import com.stx.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
//    测试scope属性。
    public void test1(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 =(UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 =(UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
