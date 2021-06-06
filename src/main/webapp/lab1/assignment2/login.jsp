<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%-- todo 9: use c:out to print message fron request --%>
<%--<%=request.getAttribute("message")%>--%>
<c:out value="${sessionScope.message}"/>
<%--todo 1: use c:url to set url in action="validate.jsp" --%>
<c:url value="/lab1/assignment2/validate.jsp" var="l"/>
<form action="${l}">
    Username : <input type="text" name="username"><br>
    Password : <input type="password" name="password"><br>
    <input type="submit" value="Login"/>
</form>

</body>
</html>