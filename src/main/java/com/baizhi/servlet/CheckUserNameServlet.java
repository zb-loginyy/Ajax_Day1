package com.baizhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckUserNameServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //接收用户名
        String username = req.getParameter("username");
        //做校验
        if ("小黑".equals(username)){
            //把校验信息存储到对应的request作用域中
            req.setAttribute("message","您的用户名已被注册不可用");
        }else {
            req.setAttribute("message","您的用户名可用");
        }
        req.setAttribute("username",username);
        req.getRequestDispatcher("/register.jsp").forward(req,resp);
    }
}
