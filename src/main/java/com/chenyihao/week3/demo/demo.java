package com.chenyihao.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class demo extends HttpServlet {
    //1.tomcat read wen.xml file and find out all servlet class
    //2.load servlet-when?2.first request for this servlet class
    //3.call default constructor-add code
    public demo(){
        System.out.println("i am in constructor-->demo() ");
    }
    //4.int () -add code
    //use for
    @Override
    public void init(){
        System.out.println("i am init()");
    }
    //5.tomcat call service()-->call doGet()
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service()-->doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy(){
        System.out.println("i am in destroy");
    }
}
