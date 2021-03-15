package com.chenyihao.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;
import java.io.PrintWriter;

//now its just a java class
//Extend HttpServlet
public class HelloWorldServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        //when client request method is GET - here - inside doGet()
        //we want to send hello to client
        //we need to write hello in response
        //get writer -java.io
        PrintWriter writer=response.getWriter();
        writer.println("HelloWorld!!!");//that all
        //next we need to tell about this Servlet to tomcat -how -?web.xml
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        //when client request method in Post-here-inside doPost()
}
}
