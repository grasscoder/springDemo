package com.aaa;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取用户数据");

    }

    public static interface UserDao {
        public void getUser();
    }
}
