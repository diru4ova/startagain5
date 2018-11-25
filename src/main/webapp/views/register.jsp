<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Olena
  Date: 24.11.2018
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration form</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>"/>
</head>
<body>
<h1> Still don't have account? Let's create! </h1>
<
<form method="post" >
    First Name: <input type="text" name="name"/><br/>
    Last Name: <input type="text" name="lastname"/><br/>
    Username: <input type="text" name="username"/><br/>
    Password: <input type="text" name="password"/><br/>



    <input type="submit" value="Register"/>

</form>

</body>
</html>
