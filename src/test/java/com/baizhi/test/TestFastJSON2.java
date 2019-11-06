package com.baizhi.test;

import com.alibaba.fastjson.JSON;
import com.baizhi.entity.User;
import org.junit.Test;

import java.util.*;

public class TestFastJSON2 {
    //json协议串转对象
    @Test
    public   void   test1(){
        User user = new User("1","张三","123456",18);
        //Java中的对象转JSON协议串
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
        //JSON协议串转对象
        User user1 = JSON.parseObject(jsonString, User.class);
        System.out.println(user1);
    }
    //json协议串转List集合
    @Test
    public  void   test3(){
        User user = new User("1","张三","123456",18);
        User user2 = new User("2","赵四","123456",18);
        //创建List集合
        List<User> users=new ArrayList<User>();
        users.add(user);
        users.add(user2);
        //List集合转JSON
        String jsonString = JSON.toJSONString(users);
        System.out.println(jsonString);
        //集合中的泛型类型
        List<User> users1 = JSON.parseArray(jsonString, User.class);
        for (User user1 : users1) {
            System.out.println(user1);
        }
    }
    //json协议串转Set集合
    @Test
    public  void   test4(){
        User user = new User("1","张三","123456",18);
        User user2 = new User("2","赵四","123456",18);
        //创建List集合
        Set<User> users=new HashSet<User>();
        users.add(user);
        users.add(user2);
        //List集合转JSON
        String jsonString = JSON.toJSONString(users);
        System.out.println(jsonString);
        //集合中的泛型类型
        Set set = JSON.parseObject(jsonString, Set.class);
        for (Object o : set) {
            System.out.println(o);
        }
    }

    //json协议串转Map集合
    @Test
    public  void   test5(){
        User user = new User("1","张三","123456",18);
        User user2 = new User("2","赵四","123456",18);
        Map<String,User> maps=new HashMap<String,User>();
        maps.put("1",user);
        maps.put("2",user2);
        //Maps集合转JSON
        String jsonString = JSON.toJSONString(maps);
        System.out.println(jsonString);
        Map map = JSON.parseObject(jsonString, Map.class);
         //获取到所有键
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(key+"====="+map.get(key));
        }
    }
}
