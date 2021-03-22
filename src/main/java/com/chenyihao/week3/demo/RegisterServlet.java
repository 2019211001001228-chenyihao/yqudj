package com.chenyihao.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//automatic -new-->servlet
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// request come here-<from method-post>
        String username =request.getParameter("username");//name of input type-<inout type="text"name="Username"/>
        String password =request.getParameter("password");//<input type="password" name="password"/>
        String email =request.getParameter("email");//input type="text"name="email"/>
        String gender =request.getParameter("gender");//<input type="radio name="gender">
        String birthDate =request.getParameter("birthDate");
        PrintWriter Writer =response.getWriter();
        Writer.println("<br>username :"+username);
        Writer.println("<br>password :"+password);
        Writer.println("<br>email :"+email);
        Writer.println("<br>gender :"+gender);
        Writer.println("<br>birthDate :"+birthDate);
        Writer.close();

    }
}
