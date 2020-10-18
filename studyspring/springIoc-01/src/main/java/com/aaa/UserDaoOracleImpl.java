package com.aaa;

public class UserDaoOracleImpl implements UserDao {
    public UserDaoOracleImpl() {
        System.out.println("执行UserDaoOracleImpl无参构造方法");
    }

    @Override
    public void getUser() {
        System.out.println("获取Oracle用户数据");

    }

}
