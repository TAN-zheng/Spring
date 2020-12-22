package com.stx.demo;

import com.stx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
* 这个是Service类的实现。
* */
public class UserController {
    public static void main(String[] args) {
       /*
       1、Class源文件。
       ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.save();
        */
       /*
        2、磁盘路径。
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("E:\\IDEASpring\\Spring\\stx_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.save();
        */
        /*
        3、getBean从类反射获取对象引用。
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("E:\\IDEASpring\\Spring\\stx_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();*/
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("E:\\IDEASpring\\Spring\\stx_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
