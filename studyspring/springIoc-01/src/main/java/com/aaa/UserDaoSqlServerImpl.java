package com.aaa;

public class UserDaoSqlServerImpl implements UserDao {
    public UserDaoSqlServerImpl() {
        System.out.println("执行UserDaoSqlServerImpl无参构造方法");
    }

    @Override
    public void getUser() {
        System.out.println("获取SqlServer用户数据");

    }

}
