package com.baizhi.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AjaxCheckUserNameServlet extends HttpServlet {


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
        //通过流的方式响应给前台对应的信息
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        if ("小黑".equals(username)){
            out.print("您的用户名已被注册  不可用");
        }else {
            out.print("您的用户可用");
        }
    }
}
