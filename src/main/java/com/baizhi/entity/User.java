package com.baizhi.entity;

import java.util.Date;
//这是从远端传过来的修改的数据
public class User {
    //指定某些属性不参与JSON协议串的转换
   // @JSONField(serialize = false)
    private  String id;
    //指定该属性转换过后  JSON协议串的名字
    //@JSONField(name = "name")
    private  String  username;
    private  String  password;
    private  Integer age;
    //指定该日期转换为JSON协议串的格式
    //@JSONField(format = "yyyy-MM-dd")
    private  Date   date;
    //这是后台修改的传给前端的数据    
    public User(String id, String username, String password, Integer age, Date date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.date = date;
    }

    public User(String id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
