package com.aaa;

public class UserDaoMysqlImpl implements UserDao {
    public UserDaoMysqlImpl() {
        System.out.println("执行UserDaoMysqlImpl无参构造方法");
    }

    @Override
    public void getUser() {
        System.out.println("默认获取Mysql用户数据");

    }


}
