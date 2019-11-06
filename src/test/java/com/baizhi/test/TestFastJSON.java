package com.baizhi.test;

import com.alibaba.fastjson.JSON;
import com.baizhi.entity.User;
import org.junit.Test;

import java.util.*;

public class TestFastJSON {

    //java中的对象==>JSON
    @Test
    public  void   test1(){
        User user = new User("1","张三","123456",18,new Date());
        //Java中的对象转JSON协议串
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
    }
    //java中的数组===>JSON
    @Test
    public  void   test2(){
        String  [] names={"嘻嘻","呵呵","嘿嘿","吼吼"};
        //Java中的数组转JSON协议串
        String jsonString = JSON.toJSONString(names);
        System.out.println(jsonString);
    }
    //java中的List  Set集合===>JSON
    @Test
    public  void   test3(){
        User user = new User("1","张三","123456",18);
        User user2 = new User("2","赵四","123456",18);
        //创建List集合
       // List<User> users=new ArrayList<User>();
        Set<User> users= new HashSet<User>();
        users.add(user);
        users.add(user2);
        //List集合转JSON
        String jsonString = JSON.toJSONString(users);
        System.out.println(jsonString);
    }
    //java中的Map集合转JSON
    @Test
    public  void   test4(){
        User user = new User("1","张三","123456",18);
        User user2 = new User("2","赵四","123456",18);
        Map<String,User> maps=new HashMap<String,User>();
        maps.put("1",user);
        maps.put("2",user2);
        //Maps集合转JSON
        String jsonString = JSON.toJSONString(maps);
        System.out.println(jsonString);
    }


}
