<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Olena
  Date: 24.11.2018
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, new user!</title>
</head>
<body>

<h1>Your profile</h1>
<c:out value="${user.username}"/><br>
<c:out value="${user.name}"/>
<c:out value="${user.lastname}"/>

</body>
</html>
