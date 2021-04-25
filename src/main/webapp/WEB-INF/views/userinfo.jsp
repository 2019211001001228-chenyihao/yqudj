<%@ page import="com.chenyihao.model.User" %>
<%@include file="header.jsp" %>
<%@page  contentType="text/html;charset=UTF-8" language="java"%>
<h1>User Info</h1>
<%--<%
Cookie[] allCookies = request.getCookies();
    for (Cookie cookie:allCookies
         ) {
        out.println("<br/>"+cookie.getName()+"---"+ cookie.getValue());
    }
%>--%>
<%
    User u = (User)session.getAttribute("user");
%>
<table>
    <tr>
        <td>Username:</td><td><%=u.getUsername()%></td>
    <tr></tr>
    <td>Password:</td><td><%=u.getPassword()%></td>
    <tr></tr>
    <td>Email:</td><td><%=u.getEmail()%></td>
    <tr></tr>
    <td>Gender:</td><td><%=u.getGender()%></td>
    <tr></tr>
    <td>Birthdate:</td><td><%=u.getBirthDate()%></td>
    </tr>
</table>
<a href="updateUser">Update</a>
<%@include file="footer.jsp"%>