package com.test;

import com.aaa.UserDao;
import com.aaa.UserDaoMysqlImpl;
import com.bbb.UserService;
import com.bbb.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserServiceImpl) context.getBean("userService");
        service.getUser();

    }
}
