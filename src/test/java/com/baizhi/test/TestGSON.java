package com.baizhi.test;

import com.baizhi.entity.User;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.Date;

public class TestGSON {
    //java中的对象或集合 转JSON协议串
    @Test
    public  void   test1(){
        User user = new User("1","张三","123456",18,new Date());
        //获取gson的对象
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }
    //JSON协议串转对象或集合
    @Test
    public  void   test2(){
        User user = new User("1","张三","123456",18,new Date());
        //获取gson的对象
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
        User user1 = gson.fromJson(json, User.class);
        System.out.println(user1);
    }
}
