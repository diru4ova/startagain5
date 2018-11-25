<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Olena
  Date: 18.11.2018
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
Hello World

<a href="<c:url value="/welcome"/>">Welcome</a>
<a href="<c:url value="/register"/>">Register</a>
<a href="<c:url value="/profile"/>">Profile</a>

</body>
</html>
