package com.bbb;

import com.aaa.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("执行UserServiceImpl的无参构造方法");
    }

    @Override
    public void getUser(UserDao userDao) {
        System.out.println("带参数get方法");
        userDao.getUser();

    }

    @Override
    public void getUser() {
        System.out.println("无参数get方法");
        userDao.getUser();

    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return this.userDao;
    }
}
