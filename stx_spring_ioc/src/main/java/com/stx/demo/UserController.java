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
       /* ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.save();*/
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext("E:\\IDEASpring\\Spring\\stx_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
